package io.strategy;

public class Main {

	public static void main(String[] args) {
		Context context=new Context(new BitCoin());
		context.executePayment();
		
		Context context2=new Context(new CreditCard());
		context2.executePayment();
	}

}
