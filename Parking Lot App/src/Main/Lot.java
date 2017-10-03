package Main;

import java.util.LinkedList;

import com.sun.corba.se.impl.orbutil.graph.Node;

public class Lot {

	private static Lot _lot;
	private LinkedList vehicleList = new LinkedList();
	

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
	
	public void insertVehicle(Vehicle vehicle){
		vehicleList.add(vehicle);
		System.out.println("Vehicle added to lot: linked list vehicleList");
	}

		public void displayLot(){
		
			    System.out.println(vehicleList.size());
			
			}

		}

