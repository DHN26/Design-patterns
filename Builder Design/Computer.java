package builderDesign;

public class Computer {
	
	private String cpu;
	private int ram;
	private int storage;
	private String graphicsCard;
	private String os;
	
	public String getCpu() {
		return cpu;
	}
	public int getRam() {
		return ram;
	}
	public int getStorage() {
		return storage;
	}
	public String getGraphicsCard() {
		return graphicsCard;
	}
	public String getOs() {
		return os;
	}
	
	private Computer(Builder builder) {
		
		    this.cpu = builder.cpu;
		    this.ram = builder.ram;
		    this.storage = builder.storage;
		    this.graphicsCard = builder.graphicsCard;
		    this.os = builder.os;
		
	}
	
	
	public static class Builder
	{
		private String cpu;
		private int ram;
		private int storage;
		private String graphicsCard;
		private String os;
		public Builder setCpu(String cpu) {
			this.cpu=cpu;
			return this;
			
		}
		public Builder setRam(int ram) {
			this.ram = ram;
			return this;
			
		}
		public  Builder setStorage(int storage) {
			this.storage = storage;
			return this;
		}
		public  Builder setGraphicsCard(String graphicsCard) {
			this.graphicsCard = graphicsCard;
			return this;
		}
		public  Builder setOs(String os) {
			this.os = os;
			return this;
		}
		
		public Computer builder()
		{
			return new Computer(this);
		}
	}
}
