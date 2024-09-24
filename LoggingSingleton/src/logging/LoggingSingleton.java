package logging;

public class LoggingSingleton {
	private static LoggingSingleton instance;
	
	
	private LoggingSingleton()
	{
	
	}
	
	public static synchronized LoggingSingleton getInstance()
	{
		if(instance==null)
		{
			
				if(instance==null)
					instance=new LoggingSingleton();
			
			
		}
		return instance;
			
	}
	
	public void info(String s1)
	{
		System.out.println("Info message : "+s1);
	}
	
	public void warning(String s1)
	{
		System.out.println("Warning message : "+s1);
	}
	
	public void debug(String s1)
	{
		System.out.println("Debug message : "+s1);
	}
}
