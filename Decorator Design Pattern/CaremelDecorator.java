package decoratorDesignPattern;

public class CaremelDecorator extends CoffeeDecorator{

	public CaremelDecorator(Coffee c) {
		super(c);
	}

	@Override
	public int cost() {

		return cd.cost()+30;
	}
	
	@Override
	public String description() {

		return cd.description()+", Caramel";
	}
}
