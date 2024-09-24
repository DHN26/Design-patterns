package prototypeDesignPAttern;

public class PrototypeMain {

	public static void main(String[] args) {
		Circle circle=new Circle(3, "lavender");
		Rectangle rec=new Rectangle(4, 7, "yellow");
		
		Circle cloneCircle=(Circle)circle.clone();
		Rectangle recClone=(Rectangle)rec.clone();
		
		circle.draw();
		cloneCircle.draw();
		cloneCircle.getColor("Grey");
		cloneCircle.draw();
		
		System.out.println();
		
		rec.draw();
		recClone.draw();
		recClone.getColor("Orange");
		recClone.draw();

	}

}
