package ape;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class Main extends Application {
	private MyPane myPane = new MyPane();
	@Override
	public void start(Stage primaryStage) {
		try {
			Scene scene = new Scene(myPane,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	class MyPane extends BorderPane{
		Text headText = new Text("Information collector");
		public MyPane() {
			setTop(headText);
			
			VBox v1 = new VBox(10);
			v1.setPadding(new Insets(12, 12, 12, 12));
			
			TextField tfName = new TextField();
			tfName.setPrefColumnCount(20);
			tfName.setAlignment(Pos.CENTER_RIGHT);
			Label lblName = new MyLabel("Name", tfName);
			
			
			ImageView ivName = new ImageView("file:images/icon1.png");
			ivName.setFitWidth(50);
			ivName.setFitHeight(50);
			
			ToggleButton tbLove = new ToggleButton("Love me or not?");
			tbLove.setGraphic(ivName);
			tbLove.setWrapText(true);
			tbLove.setGraphicTextGap(20);
			tbLove.setTextFill(Color.DARKKHAKI);
			tbLove.setAlignment(Pos.BOTTOM_RIGHT);
			tbLove.setOnAction(e -> {
				if(!tbLove.isSelected())
					tbLove.setGraphic(null);
				else
					tbLove.setGraphic(ivName);
			});
			
			ListView lvViewer = new ListView();
			lvViewer.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

			RadioButton rbMale = new RadioButton("Male");
			RadioButton rbFemale = new RadioButton("Female");
			RadioButton rbOther = new RadioButton("Other");
			ToggleGroup tgGender = new ToggleGroup();
			rbMale.setToggleGroup(tgGender);
			rbFemale.setToggleGroup(tgGender);
			rbOther.setToggleGroup(tgGender);

			ScrollBar sbVolume = new ScrollBar();
			sbVolume.setBlockIncrement(30);
			sbVolume.setUnitIncrement(1);
			sbVolume.setVisibleAmount(10);
			sbVolume.setOrientation(Orientation.HORIZONTAL);
			sbVolume.setPrefHeight(120);
			sbVolume.valueProperty().addListener(e -> {
				headText.setText(String.valueOf(sbVolume.getValue()));
			});
			
			Slider sdrVolume = new Slider();
			sdrVolume.setShowTickLabels(true);
			sdrVolume.setShowTickMarks(true);
			sdrVolume.setMajorTickUnit(10);
			sdrVolume.setMinorTickCount(1);
			
			ComboBox<String> cb1 = new ComboBox<>();
			
			cb1.setItems(javafx.collections.FXCollections.observableArrayList(new String[] {"Canada", "Nepal", "India", "Pakistan", "China", "Afghanistan", "Priyashi"}));
			cb1.setVisibleRowCount(2);
			cb1.setEditable(true);
			
//			Media media = new Media("http://liveexample.pearsoncmg.com/common/sample.mp4");
//			MediaPlayer mdp = new MediaPlayer(media);
//			MediaView mdv = new MediaView(mdp);
//			mdp.play();
			v1.getChildren().addAll(lblName, tbLove, lvViewer, rbMale, rbFemale, rbOther, sbVolume, sdrVolume, cb1);
			setCenter(v1);
			Button btnSubmit = new Button("Send");
			btnSubmit.setOnAction(e -> {
				lvViewer.getItems().add(tbLove.isSelected());
				for(Object s : lvViewer.getSelectionModel().getSelectedItems()) {
					System.out.println((String.valueOf(s)));
				}
				System.out.println(((RadioButton)tgGender.getSelectedToggle()).getText());
			});
			
			btnSubmit.setGraphic(ivName);
			BorderPane.setAlignment(btnSubmit, Pos.CENTER);
			setBottom(btnSubmit);
		}
		
		class MyLabel extends Label{
			MyLabel(String name, Node node){
				super(name, node);
				this.setContentDisplay(ContentDisplay.RIGHT);
				
			}
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
