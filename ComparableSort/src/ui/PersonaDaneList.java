package ui;

import java.io.IOException;

import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import main.Main;
import model.PersonaDane;
import model.PersonaData;

public class PersonaDaneList extends Stage {
	private PersonaData datos;
	private Main m = new Main();
	TableView<PersonaDane> table;
	Button sortName, sortApellido, sortAge;
	public PersonaDaneList() {



		try {
			datos = new PersonaData();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("PersonaDaneList.fxml"));
			Parent root = loader.load();
			table = (TableView) loader.getNamespace().get("table");
			datos.addPersona(new PersonaDane("Andres","Andrade",1000000,30,1));
			datos.addPersona(new PersonaDane("Carlos","Zapata",1000000,21,1));
			datos.addPersona(new PersonaDane("Carlos","Molta",1000000,21,1));
			datos.addPersona(new PersonaDane("Sebastian","García",1000000,14,2));
			datos.addPersona(new PersonaDane("Antonio","García",1000000,17,3));
			datos.addPersona(new PersonaDane("Cristian","Montaño",1000000,27,2));
			datos.addPersona(new PersonaDane("Valetina","Henao",1000000,57,3));
			datos.addPersona(new PersonaDane("Valetin","Echeverry",1000000,27,2));
			datos.addPersona(new PersonaDane("Valetina","Hidalgo",1000000,57,3));
			sortName = (Button) loader.getNamespace().get("sortName");
			sortApellido = (Button) loader.getNamespace().get("sortApellido");
			sortAge = (Button) loader.getNamespace().get("sortAge");
			TableColumn<PersonaDane, String> nameCol = new TableColumn<>("NAME");
			TableColumn<PersonaDane, String> apellidoCol = new TableColumn<>("LAST NAME");
			TableColumn<PersonaDane, Integer> edadCol = new TableColumn<>("AGE");

			nameCol.setCellValueFactory(new PropertyValueFactory<>("nombre"));
			apellidoCol.setCellValueFactory(new PropertyValueFactory<>("apellido"));
			edadCol.setCellValueFactory(new PropertyValueFactory<>("edad"));

			table.getColumns().addAll(nameCol, apellidoCol, edadCol);
			table.setItems(datos.getData());
			init();
			Scene scene = new Scene(root, 677, 756);
			setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void init() {

		sortName.setOnAction(event -> {
			m.compareName(datos);
		});

	}

}
