package io.command;

import java.util.Stack;

public class TextEditor {
	Stack<Command> undoStack;
	Stack<Command> redoStack;
	Document doc;

	public TextEditor(Document doc) {
		this.undoStack = new Stack<>();
		this.redoStack = new Stack<>();
		this.doc = doc;
	}

	public void type(String str) {
		Command c = new Typing(doc, str);
		c.execute();
		undoStack.push(c);
		redoStack.clear();

	}

	public void undo() {
		// System.out.println(undoSt);
		if (!undoStack.isEmpty()) {
			Command c=undoStack.pop();
			c.undo();
			redoStack.push(c);

		} else {
			System.out.println("Nothing in undo");
		}
	}

	public void redo() {
		if (!redoStack.isEmpty()) {
			Command c =redoStack.pop();
			c.execute();	
			undoStack.push(c);
		} else {
			System.out.println("Nothing in redo");
		}
	}

	public void print() {
		System.out.println(doc.getText());
	}

}
