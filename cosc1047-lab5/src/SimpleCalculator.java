
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
	MyPane pane = new MyPane();
	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Simple calculator");
		primaryStage.setScene(new Scene(pane));
		primaryStage.show();
	}

	class MyPane extends VBox{
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField result = new TextField();
		Button bAdd = new Button("Add");
		Button bSubtract = new Button("Subtract");
		Button bMultiply = new Button("Multiply");
		Button bDivide = new Button("Divide");
		MyPane(){
			this.setSpacing(20);
			this.setPadding(new Insets(10, 10, 10, 10));
			tf1.setPrefColumnCount(4);
			tf2.setPrefColumnCount(4);
			result.setPrefColumnCount(4);
			result.setEditable(false);
			
			HBox hb1 = new HBox(10);
			Label lb1 = new Label("Number 1:", tf1);
			Label lb2 = new Label("Number 2:", tf2);
			Label lb3 = new Label("Result", result);
			lb1.setContentDisplay(ContentDisplay.RIGHT);
			lb2.setContentDisplay(ContentDisplay.RIGHT);
			lb3.setContentDisplay(ContentDisplay.RIGHT);
			hb1.getChildren().addAll(lb1, lb2, lb3);
			hb1.setAlignment(Pos.CENTER);
			
			HBox hb2 = new HBox(10);
			hb2.setAlignment(Pos.CENTER);
			hb2.getChildren().addAll(bAdd, bSubtract, bMultiply, bDivide);
			this.getChildren().addAll(hb1, hb2);
			bAdd.setOnAction(e -> result.setText(String.format("%.2f", Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText()))));
			bSubtract.setOnAction(e -> result.setText(String.format("%.2f", Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText()))));
			bMultiply.setOnAction(e -> result.setText(String.format("%.2f", Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText()))));
			bDivide.setOnAction(e -> result.setText(String.format("%.2f", Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText()))));
		}
	}
}
