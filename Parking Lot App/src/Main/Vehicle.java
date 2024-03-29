package Main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Vehicle {
	private int hours;
	private int price;
	private final int ALL_DAY_PRICE = 150;
	private final int LATE_FEE = 50;
	private String slotNumber;
	private LocalDateTime now = LocalDateTime.now();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy hh:mm a");
	private String format = now.format(formatter);

	public Vehicle(String slotNumber, int hours) {
		this.slotNumber = slotNumber;
		this.hours = hours;

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void display() {
		System.out.println("******************************************************");
		System.out.println("Ticket \n" + getNow());
		System.out.println("Space Number: " + getSlotNumber());
		System.out.println("Number of hours: " + getHours());
		System.out.println("Parking costs: $" + price);
		System.out.println("Return time: " + getReturnTime(hours));
		System.out.println();
		System.out.println("Please bring ticket to window when retrieving vehicle.");
		System.out.println("If you are late to pick up your vehicle you will be \ncharged an additional $50 late fee per hour");
	}

	public String getNow() {
		return format;
	}
/**
 * 
 * @param hours
 * @return formatted return time
 */
	public String getReturnTime(int hours) {
		this.hours = hours;
		String formatReturn = now.plusHours(hours).format(formatter);
		return formatReturn;
	}

	public int calculate(int hours, Vehicle vehicle) {
		return hours;
	}

	public String getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(String slotNumber) {
		this.slotNumber = slotNumber;
	}

	public int getALL_DAY_PRICE() {
		return ALL_DAY_PRICE;
	}

	public int getLATE_FEE() {
		return LATE_FEE * getHours();
	}

	public LocalDateTime getReturnTime() {
		return now.plusHours(hours);
	}

}
