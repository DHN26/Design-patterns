package factoryDesign;

public class VehicleManager {
	public   static Vehicle processing(String s)
	{
		if(s.equals("car"))
			return new Car();
		else if(s.equals("bike"))
			return new Bike();
		else
			return new Truck();
	}
	
}
