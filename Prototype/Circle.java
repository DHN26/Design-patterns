package prototypeDesignPAttern;

public class Circle implements Shape{
	private int radius;
	private String color;
	
	public Circle(int radius, String color)
	{
		this.color=color;
		this.radius=radius;
	}
	
	public Shape clone()
	{
		return new Circle(this.radius, this.color);
	}

	@Override
	public void draw() {
		System.out.println("A circle with radius "+radius+" and "
				+ "color "+color);
		
	}

	@Override
	public String getColor(String color) {
		this.color=color;
		return color;
	}

	

}
