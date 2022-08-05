package lab4jfx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class MyJavaFx extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
// Create a button and place it in the scene
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 250);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		Stage stage = new Stage(); // Create a new stage
		FlowPane pane = new FlowPane();
		pane.setHgap(50);
		pane.getChildren().addAll(new Button("Click me!"), new Label("Niraj"));
		stage.setScene(new Scene(pane, 500, 500));
		stage.setTitle("Custom buttom and name");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}