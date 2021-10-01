package state;

public class SleepingBag {

	State insideState;
	State outsideState;

	State packedState;
	State unpackedState;
	State state;
	
	
	public SleepingBag() {

		insideState = new InsideState(this);
		outsideState = new OutsideState(this);

		packedState = new PackState(this);
		unpackedState = new UnpackState(this);
		
		state = packedState;
	}

	public State getInsideState() {
		return insideState;
	}
	public State getOutsideState() {
		return outsideState;
	}

	public State getPackedState() {
		return packedState;
	}
	public State getUnpackedState() {
		return unpackedState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void pack() {
		state.pack();
	}
	public void unpack() {
		state.unpack();
	}

	public void getInside() {
		state.getInside();
	}
	public void getOutside() {
		state.getOutside();
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		result.append("\n--------Everest Hiker --------\n");
		
		result.append("Sleeping bag " + state + "\n");
		
		return result.toString();
	}

}
