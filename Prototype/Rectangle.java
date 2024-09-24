package prototypeDesignPAttern;

public class Rectangle implements Shape{
	
	private int length;
	private int width;
	private String color;
	
	public Rectangle(int length,int width, String color)
	{
		this.color=color;
		this.length=length;
		this.width=width;
	}
	
	public Rectangle clone()
	{
		return new Rectangle(length, width, color);
	}

	@Override
	public void draw() {
		System.out.println("A square with length "+length+" width "+
				width+" and color "+color);
	}

	@Override
	public String getColor(String color) {
		this.color=color;
		return color;
	}

}
