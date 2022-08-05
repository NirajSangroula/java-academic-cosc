package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Seven2 extends Application {
	int drinkcost = 0;
	int launchcost = 0;

	@Override
	public void start(Stage primaryStage) {

		try {
			ObservableList<String> options = FXCollections.observableArrayList("Select an item", "Hot Dog", "Sandwich",
					"Hamburger");
			final ComboBox comboBox = new ComboBox(options);
			comboBox.setPrefWidth(300);;
			BorderPane root = new BorderPane();
			root.setTop(comboBox);
			comboBox.valueProperty().addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue ov, String t, String t1) {
					System.out.println(t1);

					if (t1.equals("Hot Dog")) {
						launchcost = 100;
					} else if (t1.equals("Sandwich")) {
						launchcost = 200;
					} else if (t1.equals("Hamburger")) {
						launchcost = 300;
					} else {

					}
				}
			});

			// ToggleGroup with three radio buttons
			final ToggleGroup group = new ToggleGroup();
			Text drinkText = new Text("Drink");
			// drinkText.setToggleGroup(group);
			RadioButton rb1 = new RadioButton("Coffee");
			rb1.setToggleGroup(group);
			RadioButton rb2 = new RadioButton("Tea");
			rb2.setToggleGroup(group);
			RadioButton rb3 = new RadioButton("Pop");
			//rb3.setSelected(true);
			rb3.setToggleGroup(group);
			// root.setLeft(group);
			VBox vbox = new VBox();
			vbox.getChildren().add(drinkText);
			vbox.getChildren().add(rb1);
			vbox.getChildren().add(rb2);
			vbox.getChildren().add(rb3);
			root.setLeft(vbox);

			group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
				@Override
				public void changed(ObservableValue<? extends Toggle> ov, Toggle t, Toggle t1) {
					RadioButton chk = (RadioButton) t1.getToggleGroup().getSelectedToggle(); // Cast object to radio
																								// button
					System.out.println("Selected Radio Button - " + chk.getText());
					String result = chk.getText();
					if (result.equals("Coffee")) {
						drinkcost = 50;
					} else if (result.equals("Tea")) {
						drinkcost = 60;
					} else if (result.equals("Pop")) {
						drinkcost = 70;
					}
				}
			});

			Button submitButton = new Button("Submit");
			root.setBottom(submitButton);
			root.setAlignment(submitButton, Pos.CENTER);
			submitButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					int totalcost = launchcost + drinkcost;
					root.setCenter(new Text("Total is $" + totalcost));

				}
			});

			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}