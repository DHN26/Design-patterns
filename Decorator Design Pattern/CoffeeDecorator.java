package decoratorDesignPattern;

public abstract class CoffeeDecorator implements Coffee{
	public Coffee cd;
	
	
	public CoffeeDecorator(Coffee c) {
		super();
		this.cd = c;
	}

	@Override
	public int cost() {

		return cd.cost();
	}
	
	@Override
	public String description() {

		return cd.description();
	}
}
