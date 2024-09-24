package io.command;

public class Typing implements Command{
	
	Document doc;
	String prev;
	String text;
	
	public Typing(Document doc, String text)
	{
		this.doc=doc;
		this.text=text;
	}

	@Override
	public void execute() {
		prev=doc.getText();
		doc.type(text);
	}

	@Override
	public void undo() {
		doc.setText(prev);
		
	}

}
