package io.command;

public class Document {

	StringBuilder text;

	public Document() {
		this.text = new StringBuilder();
	}

	public String undo() {
		if (text.length() > 0) {
			text.deleteCharAt(text.length() - 1);
		}
		return text.toString();
	}

	public String redo() {
		return text.toString();
	}

	public void type(String textAdd) {
		text.append(textAdd);
	}

	public String getText() {
		return text.toString();
	}

	public void setText(String text) {
		this.text = (text != null) ? new StringBuilder(text) : new StringBuilder();
	}

}
