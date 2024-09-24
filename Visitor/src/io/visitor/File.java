package io.visitor;

public class File implements Element{
	int size;
	String name;
	
	public File(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public int getSize() {
		return size;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
