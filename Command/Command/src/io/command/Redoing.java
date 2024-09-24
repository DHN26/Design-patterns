package io.command;

public class Redoing implements Command {
	
	Document doc;
	String text;

	public Redoing(Document doc) {
		this.doc = doc;
	}

	@Override
	public void execute() {
		text=doc.getText();
		doc.redo();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		doc.setText(text);
	}

}
