package io.memento;

public class Main {
	
	    public static void main(String[] args) {
	        Canvas canvas = new Canvas();
	        Caretaker caretaker = new Caretaker(canvas);

	        caretaker.addShape("Circle");
	        caretaker.addShape("Square");
	        caretaker.displayCanvas();

	        caretaker.undo();
	        caretaker.displayCanvas();

	        caretaker.redo();
	        caretaker.displayCanvas();

	        caretaker.addShape("Triangle");
	        caretaker.displayCanvas();

	        caretaker.undo();
	        caretaker.displayCanvas();

	        caretaker.redo();
	        caretaker.displayCanvas();
	    
	}

}
