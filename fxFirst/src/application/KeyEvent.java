package application;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class KeyEvent extends Application {
	TPane tpane1 = new TPane();
	@Override
	public void start(Stage arg0) throws Exception {
		arg0.setTitle("Key practices");
		arg0.setScene(new Scene(tpane1, 700, 700));
		arg0.show();
	}
	
	class TPane extends BorderPane{
		Button b1 = new Button("Click me 1");
		Pane p = new HBox();
		Circle c1 = new Circle(150, 150, 100);
		Text t1 = new Text("Hello there");
		TPane() {
			setOnKeyPressed(e -> t1.setText("You pressed " + e.getText()));
			setRight(t1);
			setCenter(p);
			PathTransition pt1 = new PathTransition();
			pt1.setAutoReverse(true);
			pt1.setNode(b1);
			pt1.setPath(c1);
			pt1.setDuration(Duration.millis(1000));
			pt1.setOrientation(
			PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
			pt1.setCycleCount(5);
			pt1.play(); // Start
			FadeTransition ft = new FadeTransition();
			ft.setFromValue(0.5);
			//ft.setByValue(0.01);
			ft.setToValue(0.2);
			ft.setAutoReverse(true);
			ft.setCycleCount(Timeline.INDEFINITE);
			ft.setNode(c1);
			ft.setDuration(new Duration(1000));
			ft.play();
			setTop(c1);
			p.setOnMouseReleased(e -> pt1.play());
			p.setOnMousePressed(e -> pt1.pause());
			p.getChildren().addAll(b1);
			b1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					t1.setText("Yohoho Button pressed");
					t1.setFill(Color.BLUE);
				}
			});
		}
	}
	public static void main(String[] args) {
		launch();
	}

}
