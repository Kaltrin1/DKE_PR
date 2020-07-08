import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.VCARD;

public class Theater {
	
	public static void main(String[] args) {
	
	String theaterUri = "https://theater-wien.at#";
	String name = "Nathan der Weise";
	
	
	Model model = ModelFactory.createDefaultModel();
	
	Resource nathan = 
			model.createResource(theaterUri).addProperty(model.createProperty("name"), name);
	
	
	model.write(System.out, "Turtle");
	
	}
}
