package io.strategy;

public class Context {

	private Payment payment;
	public Context(Payment payment)
	{
		this.payment=payment;
	}
	
	public void executePayment()
	{
		payment.payment();
	}
}
