package factoryDesign;

public class Car implements Vehicle{

	
	@Override
	public void getNoOfWheels() {
		// TODO Auto-generated method stub
		System.out.println("4 wheels");
	}

	@Override
	public void getType() {
		// TODO Auto-generated method stub
		System.out.println("Mid type");
	}

	@Override
	public void getCapacity() {
		// TODO Auto-generated method stub
		System.out.println("4 people");
	}

}
