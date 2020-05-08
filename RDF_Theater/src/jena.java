import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlNs;

import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.datatypes.xsd.impl.XSDDateType;
import org.apache.jena.iri.impl.Main;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.util.FileManager;
public class jena {
	
	public static void main(String[] args) {
		
		
		
		String uri = "http://theater.com/";
		//FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
		//Model model = FileManager.get().loadModel(uri);
		
		Model model = ModelFactory.createDefaultModel();
		
		Map<String, String> map = new HashMap();
		
		map.forEach(
				(x,y) -> map.put(x, y)
				);
		
		model.setNsPrefixes(map);
		
		model.setNsPrefix("theater", uri);
		Resource r = model.createResource(uri + "Theaterstueck");
		Property p = model.createProperty(uri + "name");
		Property musik = model.createProperty(uri + "musik");
		Literal l = model.createLiteral("Orchester");
		
		model.setNsPrefix("test", uri);
		Resource stueck = model.createResource(uri + "Vorstellung")
				.addProperty(model.createProperty(uri + "zugabe"), "19.06.2002", XSDDateType.XSDdate);
		
		r.addLiteral(musik, l);
		r.addProperty(p, "Nathan der Weise", XSDDatatype.XSDstring);
		
		model.write(System.out, "Turtle");
		
		
	}

}
