package Main;

import java.util.LinkedList;

import com.sun.corba.se.impl.orbutil.graph.Node;

public class Lot {

	private static Lot _lot;
	private LinkedList carList = new LinkedList();

	private Lot() {

	}

	public static Lot getALot() {
		if (_lot == null) {
			_lot = new Lot();
			System.out.println("Lot created.");
		} else {
			System.out.println("There can only be one lot.");
		}
		return _lot;
	}
	
	public void insertCar(Car car){
		carList.add(car);
	}

		public void displayLot(){
		
			    System.out.println(carList);
			
			}

		}

