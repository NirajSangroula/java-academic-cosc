package application;
	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane pane = new GridPane();
			
			
			
			ImageView i1 = new ImageView("file:images/1.jpg");
			ImageView i2 = new ImageView("file:images/2.png");
			ImageView i3 = new ImageView("file:images/3.jpg");
			ImageView i4 = new ImageView("file:images/4.jpg");
			pane.setPadding(new Insets(12, 12, 12, 12));
			pane.setHgap(20);
			pane.setVgap(50);
			i1.fitHeightProperty().bind(pane.heightProperty().divide(2));
			i2.fitHeightProperty().bind(pane.heightProperty().divide(2));
			i3.fitHeightProperty().bind(pane.heightProperty().divide(2));
			i4.fitHeightProperty().bind(pane.heightProperty().divide(2));

			i1.fitWidthProperty().bind(pane.widthProperty().divide(3));
			i2.fitWidthProperty().bind(pane.widthProperty().divide(2));
			i3.fitWidthProperty().bind(pane.widthProperty().divide(2));
			i4.fitWidthProperty().bind(pane.widthProperty().divide(2));
			
			
			pane.addRow(0, i1, i2);
			pane.addRow(1, i3, i4);
			GridPane.setHalignment(i1, HPos.CENTER);
			primaryStage.setTitle("Flags");
			primaryStage.setResizable(false);
			primaryStage.setScene(new Scene(pane, 1000, 750));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
