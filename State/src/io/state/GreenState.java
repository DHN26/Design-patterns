package io.state;

public class GreenState implements State{

	@Override
	public void changeSignal(Context c) {
		System.out.println("Time to goooo!!");	
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return "Green";
	}

}
