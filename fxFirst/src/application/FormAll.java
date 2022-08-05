package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FormAll extends Application {
	MyPane pane = new MyPane();

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setScene(new Scene(pane, 700, 600));
		primaryStage.show();
	}

	class MyPane extends VBox{
		TextField nameField = new TextField();
		MyPane(){
			
			setChildren();
		}

		private void setChildren() {
			getChildren().addAll(new CustomLabel("Name", nameField));
		}
		
		class CustomLabel extends Label{

			public CustomLabel(String string, TextField nameField) {
				super(string, nameField);
				this.setContentDisplay(ContentDisplay.RIGHT);
				
			}
		}
	}
	public static void main(String[] args) {
		launch();

	}

}
