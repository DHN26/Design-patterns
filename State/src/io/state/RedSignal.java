package io.state;

public class RedSignal implements State{

	@Override
	public void changeSignal(Context c) {
		System.out.println("Wait here for a while:(");
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return "Red";
	}

}
