package Main;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class CarSlotNumber implements SlotBehavior {
	// int slotNumbers[] = IntStream.rangeClosed(0, 25).toArray();
	ArrayList slotNumbers = new ArrayList(25);

	@Override
	public void setSlot(int slot) {
		slotNumbers.add(slot);

	}

	@Override
	public String toString() {
		return "CarSlotNumber [slotNumbers=" + slotNumbers + "]";
	}

}
