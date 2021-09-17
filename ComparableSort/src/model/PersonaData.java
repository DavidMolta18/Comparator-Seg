package model;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PersonaData {

	private ObservableList<PersonaDane> personas;

	public PersonaData() {
		personas = FXCollections.observableArrayList();
	}

	public void addPersona(PersonaDane persona) {
		personas.add(persona);
	}
	
	public void printData() {
		
		for(PersonaDane persona : personas) {
			
			System.out.println(persona.toString());
			
		}
		
	}

	public ObservableList<PersonaDane> getData() {
		return personas;
	}
	
}

