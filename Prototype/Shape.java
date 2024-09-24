package prototypeDesignPAttern;

public interface Shape extends Cloneable{
	
	public Shape clone();
	
	public void draw();
	
	public String getColor(String color);
	
	
	
}
