package facadeDesign;

public class Heating {
	
	public void heatOn()
	{
		System.out.println("Turning ON heat.");
	}
	
	public void heatOff()
	{
		System.out.println("Turning OFF heat.");
	}
	
	public void currentTemp(int n)
	{
		System.out.println("Current temperature is set to : "+n);
	}
}
