package lab4jf3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;

public class Box extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane g = new VBox();
		Pane hbox = new HBox(15);
		ImageView image = new ImageView("file:images/1.jpg");
		image.setFitHeight(200);
		image.setFitWidth(150);
		hbox.getChildren().addAll(new Button("Computer Science"), new Button("Chemistry"), image);
		hbox.setPadding(new Insets(10, 10, 10, 10));
		Pane vbox = new VBox(10);
		Label label1 = new Label("Courses");
		vbox.setPadding(new Insets(15, 15, 15, 15));
		vbox.setStyle("-fx-background-color: #9081b4");
		vbox.getChildren().addAll(label1, new Label("CSCI 1301"), new Label("CSCI 1302"), new Label("CSCI 2410"), new Label("CSCI 3720"));
		g.getChildren().addAll(hbox, vbox);
		primaryStage.setTitle("Show Hbox Vbox");
		primaryStage.setScene(new Scene(g, 500, 500));
		primaryStage.show();
	}
}
