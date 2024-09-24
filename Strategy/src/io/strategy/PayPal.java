package io.strategy;

public class PayPal implements Payment{

	@Override
	public void payment() {
		System.out.println("Payment through PayPal.");
	}

}
