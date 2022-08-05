package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TemperatureConverter extends Application {

//Required scene variable
	Scene Window;
//Required variables
	double celsius = 0.00, fahrenheit = 0.00;

//Main method()
	public static void main(String[] args) {
		launch(args);
	}

//Method to execute on pressing enter
	public static double onEnter(ActionEvent e, String s, double input) {
//Required variable
		double result = 0;
//If the string is "celsius"
		if (s.compareToIgnoreCase("celsius") == 0) {
//Calculates fahrenheit value of the input
			result = (((9 * input) / 5) + 32);
		} else if (s.compareToIgnoreCase("fahrenheit") == 0) {
//Else if the input is "fahrenheit"
//Calculates celsius of the input
			result = (5 * (input - 32)) / 9;
		}
//Returns result
		return result;
	}

//Start method
	@Override
	public void start(Stage primaryStage) throws Exception {
//Set title for the Stage object
		primaryStage.setTitle("Temperature Converter");

//Required components of the GUI and their styings
		Label celsiusLbl = new Label("Celcius ");
		celsiusLbl.setPadding(new Insets(0, 0, 0, 10));
		celsiusLbl.setStyle("-fx-font-weight: bold");
		Label fahrenheitLbl = new Label("Fahrenheit ");
		fahrenheitLbl.setStyle("-fx-font-weight: bold");

		TextField celsiusTxt = new TextField();
		TextField fahrenheitTxt = new TextField();

//Binding event for first textbox
		celsiusTxt.setOnAction((ActionEvent e) -> {

//Read text from first text box to string 'input'
			String input = celsiusTxt.getText();
//To handle exception
			try {
//If input is not null
				if (input.compareTo("") != 0)
//Parse input to double
					celsius = Double.parseDouble(input);
//Call onEnter method and calculate fahrenheit
				fahrenheit = TemperatureConverter.onEnter(e, "celsius", celsius);
//Display fahrenheit in sen=cond textbox
				fahrenheitTxt.setText(String.valueOf(fahrenheit));
			} catch (Exception ex) {
//If input is not double then exception will be catched here

//Create object of alert class
				Alert alert = new Alert(AlertType.INFORMATION);
//Display contents in the alert object
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("Error, input must be numerical");
				alert.showAndWait();
			}

		});

//Binding event for second textbox
		fahrenheitTxt.setOnAction((ActionEvent e) -> {
//Read text from second text box to string 'input'
			String input = fahrenheitTxt.getText();
//To handle exception
			try {
//If input is not null
				if (input.compareTo("") != 0)
//Parse input to double
					fahrenheit = Double.parseDouble(input);
//Call onEnter method and calculate celsius
				celsius = TemperatureConverter.onEnter(e, "fahrenheit", fahrenheit);
//Display celsius in first textbox
				celsiusTxt.setText(String.valueOf(celsius));
			} catch (Exception ex) {
//If input is not double then exception will be catched here

//Create object of alert class
				Alert alert = new Alert(AlertType.INFORMATION);
//Display contents in the alert object
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("Error, input must be numerical");
				alert.showAndWait();
			}

		});

//GridPane Object to set components
		GridPane g = new GridPane();
//Set components in repsective columns
		g.addColumn(0, celsiusLbl);
		g.addColumn(1, celsiusTxt);
		g.addColumn(2, fahrenheitLbl);
		g.addColumn(3, fahrenheitTxt);

//Set horizontal gap
		g.setHgap(10);

//Initialize Window
		Window = new Scene(g, 500, 50);

//Add Window to stage object
		primaryStage.setScene(Window);
		primaryStage.show();

	}
}