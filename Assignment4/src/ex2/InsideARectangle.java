package ex2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InsideARectangle extends Application {
	MyPane pane = new MyPane();
	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setScene(new Scene(pane, 500, 300));
		primaryStage.setTitle("Cursor in or out?");
		primaryStage.show();
	}

	class MyPane extends Pane{
		Text t = new Text(10, 20, "Move your mouse");
		Rectangle r = new Rectangle(80, 50, 100, 30);
		MyPane(){
			r.setFill(Color.WHITE);
			r.setStroke(Color.BLUE);
			r.setStrokeWidth(3);
			setOnMouseMoved(e -> {
				t.setText("Mouse Point is" + (r.contains(e.getX(), e.getY()) ? " inside " : " outside ") + "the rectangle");
			});
			getChildren().addAll(t, r);
		}
	}
}
