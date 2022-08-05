package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EventTrie extends Application {
	private CFlowPane pane = new CFlowPane();

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane b = new BorderPane();
		Pane p1 = new TPane();
		b.setCenter(p1);
		b.setBottom(pane);
		stage.setScene(new Scene(b, 500, 500));
		stage.show();
	}
	public class TPane extends Pane{
		Text t = new Text(50, 50, "Hi babe");
		public TPane() {
			t.setFont(Font.font("Times New Roman", 20));
			t.setFill(Color.VIOLET);
			getChildren().add(t);
			t.setOnKeyPressed(e -> {
				System.out.println("Key press detected");
				t.setText(e.getText());
			});
		}
	}
	public class CFlowPane extends Pane{
		Button b = new Button("Confirm");
		Circle c = new Circle(50, 50, 50);
		Text t = new Text(20, 20, "Niraj");
		public CFlowPane() {
			b.setOnKeyPressed(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent arg0) {
					changeSomething();
				}
			});
			c.setOnMouseClicked((MouseEvent e) -> changeCircle());
			c.setOnMouseDragged(e -> {
				c.setCenterX(e.getX());
				c.setCenterY(e.getY());
				System.out.println("Hey " + e.getX());
			});
			c.setStrokeWidth(10);
			getChildren().setAll(c);
		}
		private void changeSomething() {
			b.setScaleX((int)(Math.random()*6));
			
		}
		public void changeCircle() {
			c.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		}
	}
	public class ConfirmHandler implements EventHandler<MouseEvent>{
		@Override
		public void handle(MouseEvent arg0) {
			pane.changeCircle();
		}
		

	}
}
