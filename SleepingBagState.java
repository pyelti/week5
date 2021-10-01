package state;

public class SleepingBagState {

	public static void main(String[] args) {
		SleepingBag sleepingBag = new SleepingBag();
		
		System.out.println(sleepingBag);
		sleepingBag.unpack();
		sleepingBag.getInside();
		sleepingBag.pack();
		sleepingBag.unpack();
		System.out.println(sleepingBag);
		sleepingBag.getOutside();
		sleepingBag.pack();
		sleepingBag.getOutside();
		System.out.println(sleepingBag);
	}

}
