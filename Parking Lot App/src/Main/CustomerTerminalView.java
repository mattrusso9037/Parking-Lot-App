package Main;



import java.util.Calendar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CustomerTerminalView extends Application {

	@Override
	public void start(Stage main) throws Exception {
		Lot lot = Lot.getALot();
		BorderPane borderPane = new BorderPane();
		
		
	
		VBox vbox = new VBox();
		VBox dialPad = new VBox();
		HBox dialPadRow1 = new HBox();
		HBox dialPadRow2 = new HBox();
		HBox dialPadRow3 = new HBox();
		HBox dialPadRow4 = new HBox();
		HBox welcomeBox = new HBox();
		HBox slotNumberFieldBox = new HBox();
		HBox buttonBox = new HBox();
		VBox footer = new VBox();
		
		
		Button oneButton = new Button();
		Button twoButton = new Button();
		Button threeButton = new Button();
		Button fourButton = new Button();
		Button fiveButton = new Button();
		Button sixButton = new Button();
		Button sevenButton = new Button();
		Button eightButton = new Button();
		Button nineButton = new Button();
		Button zeroButton = new Button();
		Button backspaceButton = new Button();
		Button clearButton = new Button();
		
		
		
		
			//top 
			welcomeBox.setMinWidth(700);
			welcomeBox.setPadding(new Insets(100, 0, 100, 0));
		    welcomeBox.setStyle("-fx-background-color: #98AFC7;");
		    Text welcomeText = new Text("Please enter the space number and duration below.");
			welcomeBox.getChildren().addAll(welcomeText);
			welcomeBox.setAlignment(Pos.CENTER);
		
			
			//middle
			slotNumberFieldBox.setMinWidth(700);
			slotNumberFieldBox.setStyle("-fx-background-color: #98AFC7;");
			slotNumberFieldBox.setPadding(new Insets(0,0,0,278));
			slotNumberFieldBox.setSpacing(50);
			TextField slotNumberEntry = new TextField();
			String[] hourChoice = {"1", "2", "3", "12"};
			ComboBox timeChooser = new ComboBox();
			timeChooser.setValue("Number Of Hours");
			timeChooser.getItems().addAll(hourChoice);
			
			
			
			
			slotNumberFieldBox.getChildren().addAll(slotNumberEntry, timeChooser);
			
			
		
			buttonBox.setMinSize(700, 125);
			Button nextButton = new Button("Next");
			nextButton.setMinSize(100, 25);
			buttonBox.setStyle("-fx-background-color: #98AFC7;");
			buttonBox.setPadding(new Insets(50,0,0,500));
			buttonBox.getChildren().addAll(nextButton);
			
			//dialpad
			dialPad.setMinSize(700, 250);
			dialPad.setStyle("-fx-background-color: #98AFC7;");
			dialPad.setAlignment(Pos.CENTER);
			
			//dialpad rows
			dialPadRow1.setMinSize(10, 62);
			dialPadRow1.setMaxWidth(148);
//			dialPadRow1.setStyle("-fx-background-color: yellow;");
			
			
			dialPadRow2.setMinSize(10, 62);
			dialPadRow2.setMaxWidth(148);
//			dialPadRow2.setStyle("-fx-background-color: brown;");
			
			dialPadRow3.setMinSize(10, 62);
			dialPadRow3.setMaxWidth(148);
//			dialPadRow3.setStyle("-fx-background-color: green;");
			
			dialPadRow4.setMinSize(10, 62);
			dialPadRow4.setMaxWidth(148);
//			dialPadRow4.setStyle("-fx-background-color: tan;");
			
			
		
			//size and background of dial buttons
			
			oneButton.setMinSize(50, 62);
			oneButton.setStyle("-fx-background-image: url('/main/1.jpg')");
			
			twoButton.setMinSize(50, 62);
			twoButton.setStyle("-fx-background-image: url('/main/2.jpg')");
			
			threeButton.setMinSize(50, 62);
			threeButton.setStyle("-fx-background-image: url('/main/3.jpg')");
			
			fourButton.setMinSize(50, 62);
			fourButton.setStyle("-fx-background-image: url('/main/4.jpg')");
			
			fiveButton.setMinSize(50, 62);
			fiveButton.setStyle("-fx-background-image: url('/main/5.jpg')");
			
			sixButton.setMinSize(50, 62);
			sixButton.setStyle("-fx-background-image: url('/main/6.jpg')");
			
			sevenButton.setMinSize(50, 62);
			sevenButton.setStyle("-fx-background-image: url('/main/7.jpg')");
			
			eightButton.setMinSize(50, 62);
			eightButton.setStyle("-fx-background-image: url('/main/8.jpg')");
			
			nineButton.setMinSize(50, 62);
			nineButton.setStyle("-fx-background-image: url('/main/9.jpg')");
			
			zeroButton.setMinSize(50, 62);
			zeroButton.setStyle("-fx-background-image: url('/main/0.jpg')");
			
			backspaceButton.setMinSize(50, 62);
			backspaceButton.setStyle("-fx-background-image: url('/main/backspace.png')");
			
			clearButton.setMinSize(50, 62);
			clearButton.setStyle("-fx-background-image: url('/main/clear.png')");
			
			
			
			dialPadRow1.getChildren().addAll(oneButton, twoButton, threeButton);
			dialPadRow2.getChildren().addAll(fourButton, fiveButton, sixButton);
			dialPadRow3.getChildren().addAll(sevenButton, eightButton, nineButton);
			dialPadRow4.getChildren().addAll(backspaceButton, zeroButton, clearButton);
			
			dialPad.setSpacing(5);
			dialPad.setMinHeight(300);
			
			dialPadRow1.setSpacing(5);
			dialPadRow2.setSpacing(5);
			dialPadRow3.setSpacing(5);
			dialPadRow4.setSpacing(5);
			dialPad.getChildren().addAll(dialPadRow1, dialPadRow2, dialPadRow3, dialPadRow4);
			
			Text carRateText = new Text("The rate for cars is $25 per hour");
			Text bikeRateText = new Text("The rate for motorcycles is $20 per hour");
			Text truckRateText = new Text("The rate for trucks is $30 per hour");
			Text allDayRateText = new Text("The all day rate (12 hours) for any vehicle is $150");
			footer.setMinWidth(700);
			footer.setStyle("-fx-background-color: #E5E4E2;");
			footer.setSpacing(7);
			footer.getChildren().addAll(carRateText, bikeRateText, truckRateText, allDayRateText);
			footer.setAlignment(Pos.CENTER);
			
			
			
			oneButton.setOnAction(e -> {
				if (slotNumberEntry != null) 
					slotNumberEntry.setText(slotNumberEntry.getText() + "1");
			});
			
			twoButton.setOnAction(e -> {
				if (slotNumberEntry != null) 
					slotNumberEntry.setText(slotNumberEntry.getText() + "2");
			});
			
			threeButton.setOnAction(e -> {
				if (slotNumberEntry != null) 
					slotNumberEntry.setText(slotNumberEntry.getText() + "3");
			});
			fourButton.setOnAction(e -> {
				if (slotNumberEntry != null) 
					slotNumberEntry.setText(slotNumberEntry.getText() + "4");
			});;
			
			fiveButton.setOnAction(e -> {
				if (slotNumberEntry != null) 
					slotNumberEntry.setText(slotNumberEntry.getText() + "5");
			});;
			
			sixButton.setOnAction(e -> {
				if (slotNumberEntry != null) 
					slotNumberEntry.setText(slotNumberEntry.getText() + "6");
			});;
			sevenButton.setOnAction(e -> {
				if (slotNumberEntry != null) 
					slotNumberEntry.setText(slotNumberEntry.getText() + "7");
			});;
			
			eightButton.setOnAction(e -> {
				if (slotNumberEntry != null) 
					slotNumberEntry.setText(slotNumberEntry.getText() + "8");
			});;
			
			nineButton.setOnAction(e -> {
				if (slotNumberEntry != null) 
					slotNumberEntry.setText(slotNumberEntry.getText() + "9");
			});;
			
			backspaceButton.setOnAction(e -> {
				if (slotNumberEntry !=null) 
				slotNumberEntry.setText(slotNumberEntry.getText().substring(0, slotNumberEntry.getLength()-1));
				});;
			
			zeroButton.setOnAction(e -> {
				if (slotNumberEntry != null) 
					slotNumberEntry.setText(slotNumberEntry.getText() + "0");
			});;
			
			
			clearButton.setOnAction(e -> {
				slotNumberEntry.clear();
			});;
			
			
			
			
			
			
			
			
			nextButton.setOnAction(e -> {
				int id=0;
					if (Integer.parseInt(slotNumberEntry.getText()) <= 10){
						Car car = new Car(Integer.parseInt(slotNumberEntry.getText()));
						car.setPriceBehavior(new CarPrice());
						car.calculate(Integer.parseInt((String) timeChooser.getValue()), car);
						
						lot.insertVehicle(car);
						
						Alert details = new Alert(AlertType.CONFIRMATION);
						details.setTitle("Confirmation");
						details.setContentText("Spot Number: " + slotNumberEntry.getText() + "\nReturn time: " + car.getReturnTime() + 
								"\nPrice: $" + car.calculate(Integer.parseInt((String) timeChooser.getValue()), car));
						details.show();
						
						car.display();
					//ticket prints when alert is confirmed
						//for now it prints to the console
					} 
				
			
			});
			
			
			
			
			
			
			
			
			
			
			
			
			//footer
			
			

			
			vbox.getChildren().addAll(welcomeBox, slotNumberFieldBox,dialPad, buttonBox, footer);
			vbox.setMinSize(main.getWidth(), main.getHeight());
		borderPane.getChildren().addAll(vbox);
		
		Scene scene = new Scene(borderPane, 700, 750);
		main.setScene(scene);
		main.show();
		main.centerOnScreen();
	}

	

}
