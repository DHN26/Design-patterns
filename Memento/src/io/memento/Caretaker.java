package io.memento;

import java.util.Stack;

class Caretaker {
    private final Stack<Memento> undoStack = new Stack<>();
    private final Stack<Memento> redoStack = new Stack<>();
    private final Canvas canvas;

    public Caretaker(Canvas canvas) {
        this.canvas = canvas;
    }

    public void addShape(String shape) {
        undoStack.push(canvas.save());
        canvas.addShape(shape);
        redoStack.clear(); 
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(canvas.save());
            canvas.restore(undoStack.pop());
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(canvas.save());
            canvas.restore(redoStack.pop());
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    public void displayCanvas() {
        canvas.display();
    }
}
