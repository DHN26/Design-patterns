package io.visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Element{
	String name;
	List<Element> files=new ArrayList<Element>();
	
	public Directory(String name) {
		super();
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<Element> getFiles()
	{
		return files;
	}
	
	public void addElement(Element element) {
        files.add(element);
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	

}
