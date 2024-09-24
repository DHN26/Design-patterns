package builderDesign;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam(16)
                .setStorage(512)
                .setGraphicsCard("asdf")
                
                .builder();
		System.out.println(computer.getCpu()+" "+computer.getOs());
	}

}
