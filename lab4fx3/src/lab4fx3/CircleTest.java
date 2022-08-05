package lab4fx3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CircleTest extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Circle c1 = new Circle(15);
		c1.setCenterX(getRandomPosition());
		c1.setCenterY(getRandomPosition());

		Circle c2 = new Circle(15);
		c2.setCenterX(getRandomPosition());
		c2.setCenterY(getRandomPosition());
		Line l1 = new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());
		l1.setStroke(Color.BLACK);
		l1.setStrokeWidth(1);
		Pane pane = new Pane();
		Text text = new Text(distance(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY()));
		text.setStyle("-fx-fill: orange;");
		text.setFont(Font.font(20));
		text.setLayoutX((c1.getCenterX() + c2.getCenterX()) / 2);
		text.setLayoutY((c1.getCenterY() + c2.getCenterY()) / 2);
		pane.getChildren().addAll(c1, c2, l1, text);
		primaryStage.setScene(new Scene(pane, 500, 500));
		primaryStage.setTitle("Distance between circle");
		primaryStage.show();
	}

	private String distance(double centerX, double centerY, double centerX2, double centerY2) {
		double difX = centerX - centerX2;
		double difY = centerY - centerY2;
		double d = Math.sqrt(difX * difX + difY * difY);
		return String.format("%.2f", d);
	}

	private double getRandomPosition() {
		return Math.random() * 500;
	}

}
