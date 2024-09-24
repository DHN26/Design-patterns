package io.strategy;

public class CreditCard implements Payment{

	@Override
	public void payment() {
		System.out.println("Payment through Credit card.");
		
	}

}
