package io.command;

public class Undoing implements Command {
	Document doc;
	String prev;
	

	public Undoing(Document doc) {
        this.doc = doc;
    }

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		prev=doc.getText();
		doc.redo();
		
	}

	@Override
	public void undo() {
		doc.setText(prev);
	}

}
