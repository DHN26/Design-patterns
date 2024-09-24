package decoratorDesignPattern;

public class SimpleCoffee implements Coffee {
	private final int c = 30;

	@Override
	public int cost() {

		return c;
	}

	@Override
	public String description() {

		return "Coffee cost ";
	}

}
