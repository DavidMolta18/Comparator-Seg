package main;

import java.util.Collections;
import java.util.Comparator;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import model.PersonaDane;
import model.PersonaData;
import ui.PersonaDaneList;

public class Main extends Application{
	
	public static void main(String[] args) {
		
		Main m = new Main();


		
		
		/*
		Collections.sort(datos.getData()); // Se autocompara debido a que implementa la clase Comparable
		datos.printData();
	
		
		//Ordenamientos alternativos
		Comparator<PersonaDane> comparador = (o1,o2)->{
			int value = o1.getNombre().compareTo(o2.getNombre());
			return value;
		};
		System.out.println("-----------------------------------");
		Collections.sort(datos.getData(),comparador);
		datos.printData();
		
		System.out.println("-----------------------------------");
		Collections.sort(datos.getData(),(o1,o2)->{
			return o1.getApellido().compareTo(o2.getApellido());
		});
		datos.printData();
		
		System.out.println("-----------------------------------");
		Collections.sort(datos.getData(),(o1,o2)->{
			return o1.getEdad()-o2.getEdad();
		});
		datos.printData();
		*/
		launch(args);
	}
	

	@Override
	public void start(Stage arg0) throws Exception {
		PersonaDaneList pdl = new PersonaDaneList();
		pdl.show();
		
	}
	

	public void compareName(PersonaData datos) {
		
		Comparator<PersonaDane> comparador = (o1,o2)->{
			int value = o1.getApellido().compareTo(o2.getApellido());
			return value;
		};
		
		;
		datos.getData().sort(comparador);
	}
	

	
}
	


