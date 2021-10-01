package state;

public class OutsideState implements State {
	SleepingBag sleepingBag;
	public OutsideState(SleepingBag sleepingBag) {
		this.sleepingBag = sleepingBag;
	}

	@Override
	public void pack() {
		System.out.println("Packing Sleeping Bag");
		sleepingBag.setState(sleepingBag.getPackedState());
	}

	@Override
	public void unpack() {
		System.out.println("Sleeping bag unpacked");
		
	}

	@Override
	public void getInside() {
		System.out.println("Getting inside of sleeping bag");
		sleepingBag.setState(sleepingBag.getInsideState());
	}

	@Override
	public void getOutside() {
		System.out.println("Outside of sleeping bag");

	}
	public String toString() {
		return " getting outside of state";
	}


}
