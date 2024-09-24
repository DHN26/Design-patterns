package factoryDesign;

public class Truck implements Vehicle{

	@Override
	public void getNoOfWheels() {
		// TODO Auto-generated method stub
		System.out.println("8 wheels");
	}

	@Override
	public void getType() {
		// TODO Auto-generated method stub
		System.out.println("Heavy vehicle");
	}

	@Override
	public void getCapacity() {
		// TODO Auto-generated method stub
		System.out.println("Manyyy");
	}

}
