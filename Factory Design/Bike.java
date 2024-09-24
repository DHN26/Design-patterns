package factoryDesign;

public class Bike implements Vehicle{

	@Override
	public void getNoOfWheels() {
		System.out.println("2 wheels");
		
	}

	@Override
	public void getType() {
		System.out.println("Light vehicle");
		
	}

	@Override
	public void getCapacity() {
		System.out.println("125CC");
		
	}

}
