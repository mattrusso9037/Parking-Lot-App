package Main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FrontWindowTerminalView extends CustomerTerminalView {

	@Override
	public void start(Stage employee) throws Exception {
		BorderPane borderPane = new BorderPane();
		VBox vbox = new VBox();
		HBox welcomeBox = new HBox();
		VBox slotNumberFieldBox = new VBox();
		VBox footer = new VBox();
		HBox carSpots1 = new HBox();
		HBox carSpots2 = new HBox();
		HBox carSpots3 = new HBox();
		VBox spots = new VBox();

		Alert details = new Alert(AlertType.CONFIRMATION);
		details.setTitle("Confirmation");

		welcomeBox.setId("welcomeBox");
		slotNumberFieldBox.setId("slotNumberFieldBox");
		footer.setId("footer");

		// live view space boxes
		HBox a = new HBox();
		HBox b = new HBox();
		HBox c = new HBox();
		HBox d = new HBox();
		HBox e = new HBox();
		HBox f = new HBox();
		HBox g = new HBox();
		HBox h = new HBox();
		HBox i = new HBox();
		HBox j = new HBox();
		HBox k = new HBox();
		HBox l = new HBox();
		HBox m = new HBox();
		HBox n = new HBox();
		HBox o = new HBox();
		HBox p = new HBox();
		HBox q = new HBox();
		HBox r = new HBox();
		HBox s = new HBox();
		HBox t = new HBox();
		HBox u = new HBox();
		HBox v = new HBox();
		HBox w = new HBox();
		HBox x = new HBox();
		HBox y = new HBox();
		HBox z = new HBox();
		HBox a1 = new HBox();
		HBox b1 = new HBox();
		HBox c1 = new HBox();
		HBox d1 = new HBox();
		Label aa = new Label("1");
		Label bb = new Label("2");
		Label cc = new Label("3");
		Label dd = new Label("4");
		Label ee = new Label("5");
		Label ff = new Label("6");
		Label gg = new Label("7");
		Label hh = new Label("8");
		Label ii = new Label("9");
		Label jj = new Label("10");
		Label kk = new Label("11");
		Label ll = new Label("12");
		Label mm = new Label("13");
		Label nn = new Label("14");
		Label oo = new Label("15");
		Label pp = new Label("16");
		Label qq = new Label("17");
		Label rr = new Label("18");
		Label ss = new Label("19");
		Label tt = new Label("20");
		Label uu = new Label("21");
		Label vv = new Label("22");
		Label ww = new Label("23");
		Label xx = new Label("24");
		Label yy = new Label("25");
		Label zz = new Label("26");
		Label aa1 = new Label("27");
		Label bb1 = new Label("28");
		Label cc1 = new Label("29");
		Label dd1 = new Label("30");

		a.getChildren().add(aa);
		b.getChildren().add(bb);
		c.getChildren().add(cc);
		d.getChildren().add(dd);
		e.getChildren().add(ee);
		f.getChildren().add(ff);
		g.getChildren().add(gg);
		h.getChildren().add(hh);
		i.getChildren().add(ii);
		j.getChildren().add(jj);
		k.getChildren().add(kk);
		l.getChildren().add(ll);
		m.getChildren().add(mm);
		n.getChildren().add(nn);
		o.getChildren().add(oo);
		p.getChildren().add(pp);
		q.getChildren().add(qq);
		r.getChildren().add(rr);
		s.getChildren().add(ss);
		t.getChildren().add(tt);
		u.getChildren().add(uu);
		v.getChildren().add(vv);
		w.getChildren().add(ww);
		x.getChildren().add(xx);
		y.getChildren().add(yy);
		z.getChildren().add(zz);
		a1.getChildren().add(aa1);
		b1.getChildren().add(bb1);
		c1.getChildren().add(cc1);
		d1.getChildren().add(dd1);

		HBox[] boxArray = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, a1, b1, c1,
				d1 };

		// Conditional formatting for car spaces
		for (int arrayIterator = 0; arrayIterator < boxArray.length; arrayIterator++) {

			if (Lot.getLot().vehiclesMap.containsKey(String.valueOf(arrayIterator + 1))) {

				boxArray[arrayIterator].setStyle("-fx-background-color: red");

			} else {

				boxArray[arrayIterator].setStyle("-fx-background-color: green");

			}
		}
		Label cars = new Label("Cars   ");
		Label trucks = new Label("Trucks");
		Label bikes = new Label("Bikes  ");
		spots.setSpacing(3);
		carSpots1.setSpacing(3);
		carSpots1.setPadding(new Insets(0,0,0,2));
		carSpots2.setSpacing(3);
		carSpots3.setSpacing(3);
		carSpots1.getChildren().addAll(cars,a, b, c, d, e, f, g, h, i, j);
		carSpots2.getChildren().addAll(trucks,k, l, m, n, o, p, q, r, s, t);
		carSpots3.getChildren().addAll(bikes,u, v, w, x, y, z, a1, b1, c1, d1);
		spots.getChildren().addAll(carSpots1, carSpots2, carSpots3);

		HBox spotBox = new HBox();
		spotBox.getChildren().addAll(spots);
		spotBox.setAlignment(Pos.CENTER);
		spotBox.setPadding(new Insets(50, 0, 0, 0));

		Button searchButton = new Button();
		searchButton.setId("searchButton");
		Label spaceNumberText = new Label("space number");
		spaceNumberText.setId("spaceNumberText");
		Label returnTimeText = new Label("return time");

		Label welcomeText = new Label("Enter ticket information below");
		welcomeBox.getChildren().addAll(welcomeText);

		TextField slotNumberEntry = new TextField();
		slotNumberEntry.setMaxWidth(100);
		TextField returnTimeEntry = new TextField();
		returnTimeEntry.setMaxWidth(100);

		slotNumberFieldBox.getChildren().addAll(slotNumberEntry, spaceNumberText, searchButton, spotBox);

		Text carRateText = new Text("The rate for cars is $25 per hour");
		Text bikeRateText = new Text("The rate for motorcycles is $20 per hour");
		Text truckRateText = new Text("The rate for trucks is $30 per hour");
		Text allDayRateText = new Text("The all day rate (12 hours) for any vehicle is $150");

		footer.getChildren().addAll(bikeRateText, carRateText, truckRateText, allDayRateText);

		searchButton.setOnAction(action -> {
			//exception handling
			if (Lot.getLot().vehiclesMap.isEmpty() || slotNumberEntry.getText().isEmpty()) {

			} else {
				Lot.getLot().findVehicleById(slotNumberEntry.getText());
				Lot.getLot().value.display();

				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy hh:mm a");

				// if time now is after customer return time plus 15 minutes add late fee charge
				if (Lot.getLot().value.getReturnTime().plusMinutes(15).isBefore(now)) {
					Lot.getLot().value.setPrice(Lot.getLot().value.getPrice() + Lot.getLot().value.getLATE_FEE());

				}

				details.setContentText("Spot Number: " + Lot.getLot().value.getSlotNumber() + "\nReturn Time: " +
				Lot.getLot().value.getReturnTime().format(formatter) + "\nTime returned: " + now.format(formatter) +
						"\nCustomer Owes: $" + Lot.getLot().value.getPrice());
				details.show();

				Lot.getLot().vehiclesMap.remove(slotNumberEntry.getText());

				Platform.runLater(new Runnable() {

					@Override
					public void run() {

						try {
							new FrontWindowTerminalView().start(employee);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				});

				slotNumberEntry.clear();
			}
		});

		vbox.setMinSize(employee.getWidth(), employee.getHeight());
		borderPane.getChildren().addAll(vbox);
		borderPane.setBottom(footer);
		borderPane.setTop(welcomeBox);
		borderPane.setCenter(slotNumberFieldBox);

		Scene scene = new Scene(borderPane, 700, 750);
		scene.getStylesheets().add("/res/FrontWindowTerminalStyleSheet.css");
		FrontWindowTerminalView.class.getResource("/res/FrontWindowTerminalStyleSheet.css").toExternalForm();

		employee.setTitle("Front Window Terminal");
		employee.setX(700);
		employee.setY(0);
		employee.setScene(scene);
		employee.show();
	}

}