package state;

public class InsideState implements State {
	SleepingBag sleepingBag;
	public InsideState(SleepingBag sleepingBag) {
		this.sleepingBag = sleepingBag;
	}

	@Override
	public void pack() {
		System.out.println("You need to get out first to pack sleeping bag");

	}

	@Override
	public void unpack() {
		System.out.println("Unable to unpack sleeping bag when you are inside");

	}

	@Override
	public void getInside() {
		System.out.println("Inside of Sleeping bag");

	}

	@Override
	public void getOutside() {
		System.out.println("Getting outside of Sleeping bag");
		sleepingBag.setState(sleepingBag.getOutsideState());
	}

	public String toString() {
		return " getting in state";
	}

}
