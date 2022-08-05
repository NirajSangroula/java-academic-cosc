import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeCircleColor extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p = new Pane();
		Circle c1 = new Circle(120, 120, 100);
		c1.setStrokeWidth(2);
		c1.setStroke(Color.BLACK);
		p.setOnMousePressed(e -> {
			c1.setFill(Color.RED);
		});

		p.setOnMouseReleased(e -> {
			c1.setFill(Color.BLUE);
		});
		p.getChildren().add(c1);
		primaryStage.setScene(new Scene(p, 240, 240));
		primaryStage.setTitle("Change color by mouse click");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
