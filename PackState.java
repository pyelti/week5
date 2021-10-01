package state;

public class PackState implements State {
	SleepingBag sleepingBag;
	public PackState(SleepingBag sleepingBag) {
		this.sleepingBag = sleepingBag;
	}

	@Override
	public void pack() {
		System.out.println("Sleeping bag packed");

	}

	@Override
	public void unpack() {
		System.out.println("Unpacking sleeping bag");
		sleepingBag.setState(sleepingBag.getUnpackedState());
	}

	@Override
	public void getInside() {
		System.out.println("Unpack the sleeping bag first to get inside");

	}

	@Override
	public void getOutside() {
		System.out.println("you are already outside ");

	}
	public String toString() {
		return " packing";
	}


}
