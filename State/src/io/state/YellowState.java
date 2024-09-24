package io.state;

public class YellowState implements State{

	@Override
	public void changeSignal(Context c) {
		System.out.println("Be ready to move.");
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return "Yellow";
	}

}
