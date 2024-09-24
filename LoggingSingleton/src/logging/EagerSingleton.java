package logging;

public class EagerSingleton {
	private static final EagerSingleton es=new EagerSingleton();
	
	public static EagerSingleton getInstance()
	{
		return es;
	}
	private EagerSingleton()
	{
		System.out.println("asdf");
	}

}
