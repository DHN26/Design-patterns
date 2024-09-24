package io.command;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc=new Document();
		TextEditor te=new TextEditor(doc);
		te.type("Once ");
		te.print();
		te.type("the race ");
		te.print();
		te.undo();
		te.print();
		te.redo();
		te.print();

	}

}
