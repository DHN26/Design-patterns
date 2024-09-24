package abstractFactoryDesign;

public class ManagerClass {
	public static GUIInterface manager(String s)
	{
		if(s.equalsIgnoreCase("dark"))
			return new DarkThemeFactory();
		else if(s.equalsIgnoreCase("light"))
			return new LightThemeFActory();
		return new LightThemeFActory();
	}
}
