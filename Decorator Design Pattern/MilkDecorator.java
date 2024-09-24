package decoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator{

	public MilkDecorator(Coffee c) {
		super(c);
	}
	
	@Override
	public int cost() {

		return cd.cost()+10;
	}
	
	@Override
	public String description() {

		return cd.description()+" with milk";
	}

}
