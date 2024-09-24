package facadeDesign;

public class HomeAutomation {
	
	private Lighting lighting;
	private Heating heating;
	private Security security;
	
	
	public HomeAutomation() {
		super();
		this.lighting = new Lighting();
		this.heating = new Heating();
		this.security = new Security();
	}
	
	public void morning()
	{
		System.out.println("Setting features for morning :");
		lighting.lightOff();
		heating.heatOff();
		heating.currentTemp(20);
		System.out.println();
	}
	
	public void evening()
	{
		System.out.println("Setting features for evening :");
		lighting.lightOn();
		heating.heatOn();
		heating.currentTemp(25);
		System.out.println();
	}
	
	public void notHome()
	{
		lighting.lightOff();
		heating.heatOff();
		security.disableAlarm();
		System.out.println();
	}
	
	
	public void danger()
	{
		security.alarmOn();
	}
	
	
}
