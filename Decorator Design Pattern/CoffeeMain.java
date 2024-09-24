package decoratorDesignPattern;

public class CoffeeMain {

	public static void main(String[] args) {

		Coffee simpleCoffee = new SimpleCoffee();
		System.out.println(simpleCoffee.description() +": Rs."+  simpleCoffee.cost());

		Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
		System.out.println(milkCoffee.description() +" : Rs."  + milkCoffee.cost());

		Coffee milkSugarCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
		System.out.println(milkSugarCoffee.description() +" : Rs."+ milkSugarCoffee.cost());

		Coffee fullyDecoratedCoffee = new CaremelDecorator(new SugarDecorator(new MilkDecorator(new SimpleCoffee())));
		System.out.println(fullyDecoratedCoffee.description()  +" : Rs." + fullyDecoratedCoffee.cost());

	}

}
