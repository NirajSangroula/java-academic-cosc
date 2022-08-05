package application;
import java.io.File;

import javafx.application.*;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.*;
public class JustSomething extends Application{
	public JustSomething() {
		System.out.println("Constr application");
	}
	
	@Override
	public void start(Stage primaryStage) {
		//extracted1(primaryStage);
		
		
		primaryStage.setScene(new Scene(new MyPolyLine(), 500, 500));
		primaryStage.show();
	}

	class MyPolyLine extends Pane{
		MyPolyLine(){
			paint();
		}
		private void paint() {
			Polyline pl = new Polyline();
			pl.setStroke(Color.BLACK);
			pl.setStrokeWidth(3);
			ObservableList<Double> list = pl.getPoints();
			double scaleFactor = 50;
			for (int x = -170; x <= 170; x++) {
			list.add(x + 200.0);
			list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
			}
			getChildren().add(pl);
		}
	}
	private void extracted1(Stage primaryStage) {
		FlowPane pane = new FlowPane(Orientation.VERTICAL, 70, 3);
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(110, 12, 13, 14));
		pane.setHgap(90);
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		Circle circle = new Circle();
		circle.setRadius(100);
		circle.centerXProperty().bind(scene.widthProperty().divide(2));
		circle.centerYProperty().bind(scene.heightProperty().divide(2));
		circle.setStyle("-fx-stroke: blue; -fx-fill: green;");
		Button b1 = new Button("Click me babe");
		b1.setStyle("-fx-border-color:#347999; -fx-border-width: 4px; -fx-background-color: #00ff4f;");
		b1.setTextFill(new Color(1, 1, 1, 1));
		b1.setFont(Font.font(Font.getFontNames().get(16), FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 24));
		b1.setCursor(Cursor.HAND);
		b1.setRotate(30);
		Label l = new Label("Nitsh ");
		ImageView imageView = new ImageView(new Image("file:images/a1.png"));
		imageView.setFitWidth(300);
		imageView.setFitHeight(300);
		pane.getChildren().addAll(b1, l, circle, imageView, new TextField());
		l.setFont(Font.font(Font.getFontNames().get(15), FontWeight.BLACK, FontPosture.REGULAR, 50));
		primaryStage.setTitle("test button");
		primaryStage.show();
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
