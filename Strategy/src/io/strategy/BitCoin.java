package io.strategy;

public class BitCoin implements Payment{

	@Override
	public void payment() {
		System.out.println("Payment through Bitcoin.");
	}

}
