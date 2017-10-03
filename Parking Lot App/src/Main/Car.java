package Main;

public class Car extends Vehicle {
	private final int CAR_PRICE_PER_HOUR = 25;
	private final int ALL_DAY_PRICE = 150;
//	private PriceBehavior priceBehavior;
//	private SlotBehavior slotBehavior;
	private int price;
	private int id;
	private int hours;

	public Car(){
//		priceBehavior = new CarPrice();
//		slotBehavior = new CarSlotNumber();
	}

	public Car(int id){
		this.id = id;
	}
	
	public int calculate(int hours, Car car){
		this.hours = hours;
		price = hours * CAR_PRICE_PER_HOUR;
		
		if (hours != 1 && hours != 2 && hours != 3){
			price = ALL_DAY_PRICE;
		}
		return price;
		
	}

	@Override
	public void display() {
		System.out.println("****************************************************");
		System.out.println("Ticket " + getNow());
		System.out.println("Parking costs: $"+ price + "\nSpace number: " + id );
		System.out.println("Return time: " + getReturnTime(hours));
		System.out.println("Please bring ticket to window when retrieving car.");
	}
	public String getReturnTime(){
		return getReturnTime(hours);
	}

}
