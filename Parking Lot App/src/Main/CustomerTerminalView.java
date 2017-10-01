package Main;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CustomerTerminalView extends Application {

	@Override
	public void start(Stage main) throws Exception {
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
		HBox footer = new HBox();
		
		
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
			welcomeBox.setPadding(new Insets(100, 0, 100, 185));
		    welcomeBox.setStyle("-fx-background-color: #336699;");
		    Text welcomeText = new Text("Welcome to the lot. Please enter your space number below.");
			welcomeBox.getChildren().addAll(welcomeText);
		
			
			//middle
			slotNumberFieldBox.setMinWidth(700);
			slotNumberFieldBox.setStyle("-fx-background-color: black;");
			slotNumberFieldBox.setPadding(new Insets(0,0,0,270));
			TextField slotNumberEntry = new TextField();
			slotNumberFieldBox.getChildren().addAll(slotNumberEntry);
		
			buttonBox.setMinWidth(700);
			Button nextButton = new Button("Next");
			nextButton.setMinSize(100, 25);
			buttonBox.setStyle("-fx-background-color: red;");
			buttonBox.setPadding(new Insets(100,0,0,550));
			buttonBox.getChildren().addAll(nextButton);
			
			//dialpad
			dialPad.setMinSize(700, 250);
			dialPad.setStyle("-fx-background-color: orange;");
			dialPad.setPadding(new Insets(0,0,0,270));
			
			//dialpad rows
			dialPadRow1.setMinSize(10, 62);
			dialPadRow1.setMaxWidth(148);
			dialPadRow1.setStyle("-fx-background-color: yellow;");
			
			dialPadRow2.setMinSize(10, 62);
			dialPadRow2.setMaxWidth(148);
			dialPadRow2.setStyle("-fx-background-color: brown;");
			
			dialPadRow3.setMinSize(10, 62);
			dialPadRow3.setMaxWidth(148);
			dialPadRow3.setStyle("-fx-background-color: green;");
			
			dialPadRow4.setMinSize(10, 62);
			dialPadRow4.setMaxWidth(148);
			dialPadRow4.setStyle("-fx-background-color: tan;");
			
			
		
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
			
			
			
			
			dialPad.getChildren().addAll(dialPadRow1, dialPadRow2, dialPadRow3, dialPadRow4);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//footer
			
			

			
			vbox.getChildren().addAll(welcomeBox, slotNumberFieldBox,dialPad, buttonBox);
		
		borderPane.getChildren().addAll(vbox);
		Scene scene = new Scene(borderPane, 700, 700);
		main.setScene(scene);
		main.show();
		main.centerOnScreen();
	}

	

}