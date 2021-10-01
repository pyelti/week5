package state;

public class UnpackState implements State {
	SleepingBag sleepingBag;
	public UnpackState(SleepingBag sleepingBag) {
		this.sleepingBag = sleepingBag;
	}

	@Override
	public void pack() {
		System.out.println("Packing Sleeping bag");
		sleepingBag.setState(sleepingBag.getPackedState());
	}

	@Override
	public void unpack() {
		System.out.println("Sleeping bag is un packed");

	}

	@Override
	public void getInside() {
		System.out.println("Getting inside sleeping bag");
		sleepingBag.setState(sleepingBag.getInsideState());

	}

	@Override
	public void getOutside() {
		System.out.println("Already outside sleeping bag");
		

	}
	public String toString() {
		return " unpacking";
	}

}
