import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlNs;

import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.datatypes.xsd.XSDDateTime;
import org.apache.jena.datatypes.xsd.impl.XSDDateType;
import org.apache.jena.iri.impl.Main;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.util.FileManager;
public class jena {
	
	public static void main(String[] args) {
		
		
		
		String uri = "http://theater.com/";
		String vor = "http://theater.com/Vorstellung";
		//FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
		//Model model = FileManager.get().loadModel(uri);
		
		Model model = ModelFactory.createDefaultModel();
		
		
		model.setNsPrefix("theater", uri);
		model.setNsPrefix("vorstellung", vor);
		
		Resource r = model.createResource(uri + "Theaterstueck")
				.addProperty(model.createProperty(uri + "name"), "Nathan der Weise", XSDDatatype.XSDstring)
				.addProperty(model.createProperty(uri + "musik"), "Orchester")
				.addProperty(model.createProperty(uri + "inszinierung"), "Herbert Trattner", XSDDatatype.XSDstring)
				.addProperty(model.createProperty(uri + "kurzbeschreibung"), "Nathan, ein reicher" + 
						"juedischer Kaufmann, kommt von einer Geschaeftsreise zurueck."
						+ "Er erfaehrt, dass es zu einem Brand in seinem Haus kam. \n Ein christlicher Tempelherr habe seine Tochter Recha" + 
						"gerettet. Nathan hoert, dass jener Ordensritter sein Leben dem Sultan verdanke.", XSDDatatype.XSDstring);
		
		
		Resource stueck = model.createResource(vor)
				.addProperty(model.createProperty(vor + "vorstellungsdatum"), "19.06.2019", XSDDateType.XSDdate)
				.addProperty(model.createProperty(vor + "beginn"), "15:00")
				.addProperty(model.createProperty(vor, "ausverkauft"), 
						model.createResource(vor + "/Ausverkauft").addProperty(model.createProperty(uri, "ja"), "Ja")
												.addProperty(model.createProperty(uri, "nein"), "Nein"));
		
		
		Resource sitz = model.createResource(vor)
				.addProperty(model.createProperty(uri + "sitznr"), "15")
				.addProperty(model.createProperty(uri + "reihenr"), "11");
				
		
		Resource saal = model.createResource(vor)
				.addProperty(model.createProperty(uri + "sitzAnz"), "362")
				.addProperty(model.createProperty(uri + "saalBez"), "Burgsaal")
				.addProperty(model.createProperty(uri + "saalnr"), "15");
		
		
		Resource preisklasse = model.createResource(vor)
				.addProperty(model.createProperty(uri + "klasse"), "1");
		
		Resource saison = model.createResource(vor)
				.addProperty(model.createProperty(uri + "saison"), "Winter");
		
		
		Resource karte = model.createResource(vor)
				.addProperty(model.createProperty(uri + "kartenr"), "15664")
				.addProperty(model.createProperty(uri + "austelldatum"), "15.02.2019", XSDDateType.XSDdate);
		
		model.write(System.out, "Turtle");
		
		
	}

}
