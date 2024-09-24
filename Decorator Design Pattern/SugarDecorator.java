package decoratorDesignPattern;

public class SugarDecorator extends CoffeeDecorator{

	public SugarDecorator(Coffee c) {
		super(c);
	}
	
	@Override
	public int cost() {

		return cd.cost()+20;
	}
	
	@Override
	public String description() {

		return cd.description()+", sugar";
	}

}
