package Main;

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

public class EmployeeTerminalView extends CustomerTerminalView {

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
		
	//live view space boxes
		HBox a = new HBox();
		Label aa = new Label("1");
		a.getChildren().add(aa);
		aa.setMinSize(50,30);
		aa.setAlignment(Pos.CENTER);
		
		HBox b = new HBox();
		Label bb = new Label("2");
		b.getChildren().add(bb);
		bb.setMinSize(50,30);
		bb.setAlignment(Pos.CENTER);
		
		HBox c = new HBox();
		Label cc = new Label("3");
		c.getChildren().add(cc);
		cc.setMinSize(50,30);
		cc.setAlignment(Pos.CENTER);
		
		HBox d = new HBox();
		Label dd = new Label("4");
		d.getChildren().add(dd);
		dd.setMinSize(50,30);
		dd.setAlignment(Pos.CENTER);
		
		HBox e = new HBox();
		Label ee = new Label("5");
		e.getChildren().add(ee);
		ee.setMinSize(50,30);
		ee.setAlignment(Pos.CENTER);
		
		HBox f = new HBox();
		Label ff = new Label("6");
		f.getChildren().add(ff);
		ff.setMinSize(50,30);
		ff.setAlignment(Pos.CENTER);
		
		HBox g = new HBox();
		Label gg = new Label("7");
		g.getChildren().add(gg);
		gg.setMinSize(50,30);
		gg.setAlignment(Pos.CENTER);
		
		HBox h = new HBox();
		Label hh = new Label("8");
		h.getChildren().add(hh);
		hh.setMinSize(50,30);
		hh.setAlignment(Pos.CENTER);
		
		HBox i = new HBox();
		Label ii = new Label("9");
		i.getChildren().add(ii);
		ii.setMinSize(50,30);
		ii.setAlignment(Pos.CENTER);
		
		HBox j = new HBox();
		Label jj = new Label("10");
		j.getChildren().add(jj);
		jj.setMinSize(50,30);
		jj.setAlignment(Pos.CENTER);
		
		HBox k= new HBox();
		Label kk = new Label("11");
		k.getChildren().add(kk);
		kk.setMinSize(50,30);
		kk.setAlignment(Pos.CENTER);
		
		HBox l = new HBox();
		Label ll = new Label("12");
		l.getChildren().add(ll);
		ll.setMinSize(50,30);
		ll.setAlignment(Pos.CENTER);
		
		HBox m = new HBox();
		Label mm = new Label("13");
		m.getChildren().add(mm);
		mm.setMinSize(50,30);
		mm.setAlignment(Pos.CENTER);
		
		HBox n = new HBox();
		Label nn = new Label("14");
		n.getChildren().add(nn);
		nn.setMinSize(50,30);
		nn.setAlignment(Pos.CENTER);
		
		HBox o = new HBox();
		Label oo = new Label("15");
		o.getChildren().add(oo);
		oo.setMinSize(50,30);
		oo.setAlignment(Pos.CENTER);
		
		HBox p = new HBox();
		Label pp = new Label("16");
		p.getChildren().add(pp);
		pp.setMinSize(50,30);
		pp.setAlignment(Pos.CENTER);
		
		HBox q = new HBox();
		Label qq = new Label("17");
		q.getChildren().add(qq);
		qq.setMinSize(50,30);
		qq.setAlignment(Pos.CENTER);
		
		HBox r = new HBox();
		Label rr = new Label("18");
		r.getChildren().add(rr);
		rr.setMinSize(50,30);
		rr.setAlignment(Pos.CENTER);
		
		HBox s = new HBox();
		Label ss = new Label("19");
		s.getChildren().add(ss);
		ss.setMinSize(50,30);
		ss.setAlignment(Pos.CENTER);
		
		HBox t = new HBox();
		Label tt = new Label("20");
		t.getChildren().add(tt);
		tt.setMinSize(50,30);
		tt.setAlignment(Pos.CENTER);
		
		HBox u = new HBox();
		Label uu = new Label("21");
		u.getChildren().add(uu);
		uu.setMinSize(50,30);
		uu.setAlignment(Pos.CENTER);
		
		HBox v = new HBox();
		Label vv = new Label("22");
		v.getChildren().add(vv);
		vv.setMinSize(50,30);
		vv.setAlignment(Pos.CENTER);
		
		HBox w = new HBox();
		Label ww = new Label("23");
		w.getChildren().add(ww);
		ww.setMinSize(50,30);
		ww.setAlignment(Pos.CENTER);
		
		HBox x = new HBox();
		Label xx = new Label("24");
		x.getChildren().add(xx);
		xx.setMinSize(50,30);
		xx.setAlignment(Pos.CENTER);
		
		HBox y = new HBox();
		Label yy = new Label("25");
		y.getChildren().add(yy);
		yy.setMinSize(50,30);
		yy.setAlignment(Pos.CENTER);
		
		HBox z = new HBox();
		Label zz = new Label("26");
		z.getChildren().add(zz);
		zz.setMinSize(50,30);
		zz.setAlignment(Pos.CENTER);
		
		HBox a1 = new HBox();
		Label aa1 = new Label("27");
		a1.getChildren().add(aa1);
		aa1.setMinSize(50,30);
		aa1.setAlignment(Pos.CENTER);
	
		HBox b1 = new HBox();
		Label bb1 = new Label("28");
		b1.getChildren().add(bb1);
		bb1.setMinSize(50,30);
		bb1.setAlignment(Pos.CENTER);
		
		HBox c1 = new HBox();
		Label cc1 = new Label("29");
		c1.getChildren().add(cc1);
		cc1.setMinSize(50,30);
		cc1.setAlignment(Pos.CENTER);
		
		HBox d1 = new HBox();
		Label dd1 = new Label("30");
		d1.getChildren().add(dd1);
		dd1.setMinSize(50,30);
		dd1.setAlignment(Pos.CENTER);
		
	
		//live view conditional formatting
			if (Lot.getLot().vehiclesMap.containsKey("1")) {
				aa.setStyle("-fx-background-color: red");
			} else {
				aa.setStyle("-fx-background-color: green");
			}
			if (Lot.getLot().vehiclesMap.containsKey("2")) {
				bb.setStyle("-fx-background-color: red");
			} else {
				bb.setStyle("-fx-background-color: green");
			}
			if (Lot.getLot().vehiclesMap.containsKey("3")) {
				cc.setStyle("-fx-background-color: red");
			} else {
				cc.setStyle("-fx-background-color: green");
			}
			if (Lot.getLot().vehiclesMap.containsKey("4")) {
				dd.setStyle("-fx-background-color: red");
			} else {
				dd.setStyle("-fx-background-color: green");
			}
			if (Lot.getLot().vehiclesMap.containsKey("5")) {
				ee.setStyle("-fx-background-color: red");
			} else {
				ee.setStyle("-fx-background-color: green");
			}
			if (Lot.getLot().vehiclesMap.containsKey("6")) {
				ff.setStyle("-fx-background-color: red");
			} else {
				ff.setStyle("-fx-background-color: green");
			}
			if (Lot.getLot().vehiclesMap.containsKey("7")) {
				gg.setStyle("-fx-background-color: red");
			} else {
				gg.setStyle("-fx-background-color: green");
			}	if (Lot.getLot().vehiclesMap.containsKey("8")) {
				hh.setStyle("-fx-background-color: red");
			} else {
				hh.setStyle("-fx-background-color: green");
			}
			if (Lot.getLot().vehiclesMap.containsKey("9")) {
				ii.setStyle("-fx-background-color: red");
			} else {
				ii.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("10")) {
				jj.setStyle("-fx-background-color: red");
			} else {
				jj.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("11")) {
				kk.setStyle("-fx-background-color: red");
			} else {
				kk.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("12")) {
				ll.setStyle("-fx-background-color: red");
			} else {
				ll.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("13")) {
				mm.setStyle("-fx-background-color: red");
			} else {
				mm.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("14")) {
				nn.setStyle("-fx-background-color: red");
			} else {
				nn.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("15")) {
				oo.setStyle("-fx-background-color: red");
			} else {
				oo.setStyle("-fx-background-color: green");
			}	
			if (Lot.getLot().vehiclesMap.containsKey("16")) {
				pp.setStyle("-fx-background-color: red");
			} else {
				pp.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("17")) {
				qq.setStyle("-fx-background-color: red");
			} else {
				qq.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("18")) {
				rr.setStyle("-fx-background-color: red");
			} else {
				rr.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("19")) {
				ss.setStyle("-fx-background-color: red");
			} else {
				ss.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("20")) {
				tt.setStyle("-fx-background-color: red");
			} else {
				tt.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("21")) {
				uu.setStyle("-fx-background-color: red");
			} else {
				uu.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("22")) {
				vv.setStyle("-fx-background-color: red");
			} else {
				vv.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("23")) {
				ww.setStyle("-fx-background-color: red");
			} else {
				ww.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("24")) {
				xx.setStyle("-fx-background-color: red");
			} else {
				xx.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("25")) {
				yy.setStyle("-fx-background-color: red");
			} else {
				yy.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("26")) {
				zz.setStyle("-fx-background-color: red");
			} else {
				zz.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("27")) {
				aa1.setStyle("-fx-background-color: red");
			} else {
				aa1.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("28")) {
				bb1.setStyle("-fx-background-color: red");
			} else {
				bb1.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("29")) {
				cc1.setStyle("-fx-background-color: red");
			} else {
				cc1.setStyle("-fx-background-color: green");
			}if (Lot.getLot().vehiclesMap.containsKey("30")) {
				dd1.setStyle("-fx-background-color: red");
			} else {
				dd1.setStyle("-fx-background-color: green");
			}
	
			spots.setSpacing(3);
		carSpots1.setSpacing(3);
		carSpots1.getChildren().addAll(a, b, c,d,e,f,g,h,i,j);
		carSpots2.setSpacing(3);
		carSpots2.getChildren().addAll(k,l,m,n,o,p,q,r,s,t);
		carSpots3.setSpacing(3);
		carSpots3.getChildren().addAll(u,v,w,x,y,z,a1,b1,c1,d1);
		spots.getChildren().addAll(carSpots1,carSpots2,carSpots3);
		HBox spotBox = new HBox();
		spotBox.getChildren().addAll(spots);
		spotBox.setAlignment(Pos.CENTER);
		spotBox.setPadding(new Insets(50,0,0,0));
		
		Button searchButton = new Button("search");
		searchButton.setMinWidth(100);

		Label spaceNumberText = new Label("space number");
		Label returnTimeText = new Label("return time");

		// top
		welcomeBox.setMinHeight(200);
		welcomeBox.setPadding(new Insets(100, 0, 100, 0));
		welcomeBox.setStyle("-fx-background-color: #98AFC7;");
		Text welcomeText = new Text("Enter ticket information below");
		welcomeBox.getChildren().addAll(welcomeText);
		welcomeBox.setAlignment(Pos.CENTER);

		// middle
		slotNumberFieldBox.setMinWidth(700);
		slotNumberFieldBox.setStyle("-fx-background-color: #98AFC7;");
		slotNumberFieldBox.setSpacing(50);
		TextField slotNumberEntry = new TextField();
		TextField returnTimeEntry = new TextField();
		slotNumberEntry.setMaxWidth(100);
		returnTimeEntry.setMaxWidth(100);
		slotNumberFieldBox.setSpacing(5);
		slotNumberFieldBox.getChildren().addAll(slotNumberEntry, spaceNumberText, searchButton, spotBox);
		slotNumberFieldBox.setAlignment(Pos.CENTER);

		Text carRateText = new Text("The rate for cars is $25 per hour");
		Text bikeRateText = new Text("The rate for motorcycles is $20 per hour");
		Text truckRateText = new Text("The rate for trucks is $30 per hour");
		Text allDayRateText = new Text("The all day rate (12 hours) for any vehicle is $150");
		footer.setMinWidth(700);
		footer.setStyle("-fx-background-color: #E5E4E2;");
		footer.setSpacing(7);
		footer.getChildren().addAll(carRateText, bikeRateText, truckRateText, allDayRateText);
		footer.setAlignment(Pos.CENTER);

		searchButton.setOnAction(action -> {
			if (!Lot.getLot().vehiclesMap.isEmpty()) {
				Lot.getLot().findVehicleById(slotNumberEntry.getText());
				Lot.getLot().value.display();

				Alert details = new Alert(AlertType.CONFIRMATION);
				details.setTitle("Confirmation");
				details.setContentText("Spot Number: " + Lot.getLot().value.getSlotNumber() + "\nCustomer Owes: $"
						+ Lot.getLot().value.getPrice());
				details.show();
				

				// if time now > return time add $100
				// if(Integer.parseInt(Lot.getLot().value.getNow()) >
				// Integer.parseInt(Lot.getLot().value.getReturnTime(Lot.getLot().value.getHours())))
				// {
				// Lot.getLot().value.setPrice(Lot.getLot().value.getPrice() +
				// 100);
				//
				// }

				Lot.getLot().vehiclesMap.remove(slotNumberEntry.getText());
				
				Platform.runLater(new Runnable() {
					
					@Override
					public void run() {
					
						try {
							new EmployeeTerminalView().start(employee);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						};
						
					}
					
				});
			}
			slotNumberEntry.clear();
		});

		// footer
		vbox.setMinSize(employee.getWidth(), employee.getHeight());
		borderPane.getChildren().addAll(vbox);
		borderPane.setBottom(footer);
		borderPane.setTop(welcomeBox);
		borderPane.setCenter(slotNumberFieldBox);
		Scene scene = new Scene(borderPane, 700, 750);
		employee.setTitle("Employee Terminal");
		employee.setX(700);
		employee.setY(0);
		employee.setScene(scene);
		employee.show();
	}

	private void car(int parseInt, String returnTime) {
		// TODO Auto-generated method stub

	}

}
