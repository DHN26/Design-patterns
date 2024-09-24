package io.template;

public abstract class Processor {
	
	public void dataProcessing(String file)
	{
		reading();
		parseing(file);
		processing();
		saving();
	}
	
	 public void parseing(String file) {
		 System.out.println("Parsing through a "+file+" file.");
	 }
	
	 abstract void reading();
	
	 abstract void processing();
	
	 abstract void saving();
}
