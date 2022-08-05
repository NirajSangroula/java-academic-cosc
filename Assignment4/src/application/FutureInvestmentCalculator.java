package application;
	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class FutureInvestmentCalculator extends Application {
	@Override
	public void start(Stage primaryStage) {
		MyPane pane = new MyPane();
		try {
			primaryStage.setScene(new Scene(pane));
			primaryStage.setTitle("Future investment");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	class MyPane extends GridPane{
		TextField tInvestmentAmount = new TextField();
		TextField tNoOfYears = new TextField();
		TextField tAnnualInterestRate = new TextField();
		TextField tFutureValue = new TextField();
		Button bCalculate = new Button("Calculate");
		MyPane(){
			setHgap(40);
			setVgap(5);
			this.setAlignment(Pos.CENTER);
			this.setPadding(new Insets(10, 40, 20, 20));
			tInvestmentAmount.setAlignment(Pos.CENTER_RIGHT);
			tNoOfYears.setAlignment(Pos.CENTER_RIGHT);
			tAnnualInterestRate.setAlignment(Pos.CENTER_RIGHT);
			tFutureValue.setAlignment(Pos.CENTER_RIGHT);
			
			addRow(0, new Label("Investment Amount:"), tInvestmentAmount);
			addRow(1, new Label("Number of Years:"), tNoOfYears);
			addRow(2, new Label("Annual Interest Rate:"), tAnnualInterestRate);
			addRow(3, new Label("Future value:"), tFutureValue);
			add(bCalculate, 1, 4);
			
			GridPane.setHalignment(bCalculate, HPos.RIGHT);
			bCalculate.setOnAction(e -> {
				double amount = Double.parseDouble(tInvestmentAmount.getText());
				double monthlyInterestRate = Double.parseDouble(tAnnualInterestRate.getText()) / 1200;
				double years = Double.parseDouble(tNoOfYears.getText());
				Investment i = new Investment(amount, monthlyInterestRate, years);
				tFutureValue.setText(String.format("$%.2f", i.getFutureInvestmentValue()));
			});
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
