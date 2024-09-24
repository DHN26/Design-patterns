package io.state;

public class Main {

	public static void main(String[] args) {
		Context c = new Context(new GreenState());
		c.changeSignal();

		System.out.println("Current State: " + c.getState().getState());

		c.setState(new YellowState());
		c.changeSignal();
		System.out.println("Current State: " + c.getState().getState());
		
		c.setState(new RedSignal());
		c.changeSignal();
		System.out.println("Current State: " + c.getState().getState());

	}
}
