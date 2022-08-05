package ape;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RAMFx extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		Pane pane = new Pane();
		Circle c1 = new Circle(getRandomNum(), getRandomNum(), 20);
		c1.setFill(Color.WHITE);
		c1.setStrokeWidth(3);
		c1.setStroke(Color.BLACK);
		Circle c2 = new Circle(getRandomNum(), getRandomNum(), 20);
		c2.setFill(Color.WHITE);
		c2.setStrokeWidth(3);
		c2.setStroke(Color.BLACK);
		
		Line l1 = new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());
		pane.getChildren().addAll(l1, c1, c2, new Text(c1.getCenterX(), 
				c1.getCenterY(), "1"), new Text(c2.getCenterX(), c2.getCenterY(), "2"));
		arg0.setScene(new Scene(pane, 700, 500));
		arg0.show();
	}

	private double getRandomNum() {
		return Math.random() * 300 + 50;
	}

	public static void main(String[] args) {
		launch();

	}

}
