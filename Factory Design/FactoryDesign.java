package factoryDesign;

import java.util.Scanner;

public class FactoryDesign {

	public static void main(String[] args) {
		VehicleManager vm=new VehicleManager();
		Scanner scan=new Scanner(System.in);
		Vehicle v=vm.processing("bike");
		v.getCapacity();
		v.getNoOfWheels();
		v.getType();
	}

}
