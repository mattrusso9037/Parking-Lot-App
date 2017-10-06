package Main;

import java.util.Calendar;

import com.sun.javafx.tk.Toolkit.Task;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CustomerTerminalView extends Application {

	@Override
	public void start(Stage main) throws Exception {

		final Lot lot = Lot.createALot();

		// start employee terminal
		FrontWindowTerminalView employeeTerminal = new FrontWindowTerminalView();
		Stage employee = new Stage();
		employeeTerminal.start(employee);

		BorderPane borderPane = new BorderPane();

		VBox vbox = new VBox();
		VBox dialPad = new VBox();
		HBox dialPadRow1 = new HBox();
		HBox dialPadRow2 = new HBox();
		HBox dialPadRow3 = new HBox();
		HBox dialPadRow4 = new HBox();
		HBox welcomeBox = new HBox();
		HBox hoursBox = new HBox();
		HBox buttonBox = new HBox();
		VBox footer = new VBox();
		
		welcomeBox.setId("welcomeBox");
		hoursBox.setId("hoursBox");
		dialPad.setId("dialPad");
		buttonBox.setId("buttonBox");
		footer.setId("footer");

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
		
		Alert detailAlert = new Alert(AlertType.CONFIRMATION);
		detailAlert.setTitle("Confirmation");

		Label welcomeText = new Label("Enter space number and duration below");
		welcomeBox.getChildren().addAll(welcomeText);
		
		TextField slotNumberEntry = new TextField();
		slotNumberEntry.setMaxWidth(125);
		
		String[] hourChoice = { "1", "2", "3", "12" };
		ComboBox timeChooser = new ComboBox();
		timeChooser.setValue("Number Of Hours");
		timeChooser.getItems().addAll(hourChoice);
		
		hoursBox.setPadding(new Insets(0, 20, 0, 0));
		hoursBox.getChildren().addAll(timeChooser);
		
		// dialpad rows
		dialPadRow1.setMinSize(10, 62);
		dialPadRow1.setMaxWidth(148);

		dialPadRow2.setMinSize(10, 62);
		dialPadRow2.setMaxWidth(148);

		dialPadRow3.setMinSize(10, 62);
		dialPadRow3.setMaxWidth(148);

		dialPadRow4.setMinSize(10, 62);
		dialPadRow4.setMaxWidth(148);

		
		Button nextButton = new Button("Next");
		nextButton.setMinSize(100, 25);
		
		buttonBox.getChildren().addAll(nextButton);
		buttonBox.setPadding(new Insets(0, 20, 0, 0));

		// size and background of dial buttons
		oneButton.setMinSize(50, 62);
		oneButton.setStyle("-fx-background-image: url('/res/1.jpg')");

		twoButton.setMinSize(50, 62);
		twoButton.setStyle("-fx-background-image: url('/res/2.jpg')");

		threeButton.setMinSize(50, 62);
		threeButton.setStyle("-fx-background-image: url('/res/3.jpg')");

		fourButton.setMinSize(50, 62);
		fourButton.setStyle("-fx-background-image: url('/res/4.jpg')");

		fiveButton.setMinSize(50, 62);
		fiveButton.setStyle("-fx-background-image: url('/res/5.jpg')");

		sixButton.setMinSize(50, 62);
		sixButton.setStyle("-fx-background-image: url('/res/6.jpg')");

		sevenButton.setMinSize(50, 62);
		sevenButton.setStyle("-fx-background-image: url('/res/7.jpg')");

		eightButton.setMinSize(50, 62);
		eightButton.setStyle("-fx-background-image: url('/res/8.jpg')");

		nineButton.setMinSize(50, 62);
		nineButton.setStyle("-fx-background-image: url('/res/9.jpg')");

		zeroButton.setMinSize(50, 62);
		zeroButton.setStyle("-fx-background-image: url('/res/0.jpg')");

		backspaceButton.setMinSize(50, 62);
		backspaceButton.setStyle("-fx-background-image: url('/res/backspace.png')");

		clearButton.setMinSize(50, 62);
		clearButton.setStyle("-fx-background-image: url('/res/clear.png')");

		dialPadRow1.getChildren().addAll(oneButton, twoButton, threeButton);
		dialPadRow2.getChildren().addAll(fourButton, fiveButton, sixButton);
		dialPadRow3.getChildren().addAll(sevenButton, eightButton, nineButton);
		dialPadRow4.getChildren().addAll(backspaceButton, zeroButton, clearButton);
		dialPadRow1.setSpacing(5);
		dialPadRow2.setSpacing(5);
		dialPadRow3.setSpacing(5);
		dialPadRow4.setSpacing(5);
		dialPad.getChildren().addAll(slotNumberEntry, dialPadRow1, dialPadRow2, dialPadRow3, dialPadRow4);

		// footer
		Text carRateText = new Text("The rate for cars is $25 per hour");
		Text bikeRateText = new Text("The rate for motorcycles is $20 per hour");
		Text truckRateText = new Text("The rate for trucks is $30 per hour");
		Text allDayRateText = new Text("The all day rate (12 hours) for any vehicle is $150");

		footer.getChildren().addAll(bikeRateText, carRateText, truckRateText, allDayRateText);

		// dialpad buttons
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
		});
		;

		fiveButton.setOnAction(e -> {
			if (slotNumberEntry != null)
				slotNumberEntry.setText(slotNumberEntry.getText() + "5");
		});
		;

		sixButton.setOnAction(e -> {
			if (slotNumberEntry != null)
				slotNumberEntry.setText(slotNumberEntry.getText() + "6");
		});
		;
		sevenButton.setOnAction(e -> {
			if (slotNumberEntry != null)
				slotNumberEntry.setText(slotNumberEntry.getText() + "7");
		});
		;

		eightButton.setOnAction(e -> {
			if (slotNumberEntry != null)
				slotNumberEntry.setText(slotNumberEntry.getText() + "8");
		});
		;

		nineButton.setOnAction(e -> {
			if (slotNumberEntry != null)
				slotNumberEntry.setText(slotNumberEntry.getText() + "9");
		});
		;

		backspaceButton.setOnAction(e -> {
			if (slotNumberEntry != null)
				slotNumberEntry.setText(slotNumberEntry.getText().substring(0, slotNumberEntry.getLength() - 1));
		});
		;

		zeroButton.setOnAction(e -> {
			if (slotNumberEntry != null)
				slotNumberEntry.setText(slotNumberEntry.getText() + "0");
		});
		;

		clearButton.setOnAction(e -> {
			slotNumberEntry.clear();
		});
		;

		nextButton.setOnAction(e -> {
			//exception handling
			if(slotNumberEntry.getText().isEmpty() || timeChooser.getValue().equals("Number Of Hours")){
				
			} else {
			// car
			if (Integer.parseInt(slotNumberEntry.getText()) <= 10) {

				Car car = new Car(slotNumberEntry.getText(), Integer.parseInt((String) timeChooser.getValue()));
				car.setPrice(car.calculate(car.getHours(), car));
				lot.insertVehicle(slotNumberEntry.getText(), car);

				// confirmation
				detailAlert.setContentText(
						"Space Number: " + slotNumberEntry.getText() + "\nReturn time: " + car.getReturnTime(car.getHours())
								+ "\nPrice: $" + car.calculate(Integer.parseInt((String) timeChooser.getValue()), car));
				detailAlert.show();
				slotNumberEntry.clear();
				timeChooser.setValue("Number Of Hours");

				// truck
			} else if (Integer.parseInt(slotNumberEntry.getText()) > 10
					&& Integer.parseInt(slotNumberEntry.getText()) <= 20) {
				Truck truck = new Truck(slotNumberEntry.getText(), Integer.parseInt((String) timeChooser.getValue()));
				truck.setPrice(truck.calculate(truck.getHours(), truck));
				lot.insertVehicle(slotNumberEntry.getText(), truck);

				// confirmation				
				detailAlert.setContentText("Space Number: " + slotNumberEntry.getText() + "Number of hours: "
						+ truck.getHours() + "\nReturn time: "
						+ truck.getReturnTime() + "\nPrice: $"
						+ truck.getPrice());
				detailAlert.show();
				slotNumberEntry.clear();
				timeChooser.setValue("Number Of Hours");

				// bike
			} else if (Integer.parseInt(slotNumberEntry.getText()) > 20
					&& Integer.parseInt(slotNumberEntry.getText()) <= 30) {
				Bike bike = new Bike(slotNumberEntry.getText(), Integer.parseInt((String) timeChooser.getValue()));
				bike.setPrice(bike.calculate(bike.getHours(), bike));
				lot.insertVehicle(slotNumberEntry.getText(), bike);

				// confirmation
				detailAlert.setContentText("Space Number: " + slotNumberEntry.getText() + "\nReturn time: "
						+ bike.getReturnTime() + "\nPrice: $"
						+ bike.calculate(Integer.parseInt((String) timeChooser.getValue()), bike));
				detailAlert.show();
				slotNumberEntry.clear();
				timeChooser.setValue("Number Of Hours");
			}
			// ticket prints when alert is confirmed
			// for now the ticket is printed to the console

			Platform.runLater(new Runnable() {

				@Override
				public void run() {

					try {
						new FrontWindowTerminalView().start(employee);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					;

				}

			});
			}
		});

		VBox center = new VBox();
		borderPane.setStyle("-fx-background-color: #98AFC7");
		center.getChildren().addAll(hoursBox, dialPad, buttonBox);
		vbox.getChildren().addAll(welcomeBox, center, footer);
		vbox.setMinSize(main.getWidth(), main.getHeight());
		borderPane.getChildren().addAll(vbox);
		footer.setMinHeight(main.getHeight() - (welcomeBox.getHeight() + center.getHeight()) * 2);
		center.setMinHeight(main.getHeight() - (welcomeBox.getHeight() + footer.getHeight()));
		welcomeBox.setMinHeight(main.getHeight() - (center.getHeight() + footer.getHeight()));
		borderPane.setBottom(footer);
		borderPane.setTop(welcomeBox);
		borderPane.setCenter(center);
		

		Scene scene = new Scene(borderPane, 700, 750);
		scene.getStylesheets().add("/res/CustomerTerminalStyleSheet.css");
		FrontWindowTerminalView.class.getResource("/res/CustomerTerminalStyleSheet.css").toExternalForm();

		main.setTitle("Customer Terminal");
		main.setX(0);
		main.setY(0);
		main.setScene(scene);
		main.show();
	}

}
