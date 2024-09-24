package io.memento;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Canvas {
    private List<String> shapes = new ArrayList<>();

    public void addShape(String shape) {
        shapes.add(shape);
    }

    public Memento save() {
        return new Memento(shapes);
    }

    public void restore(Memento memento) {
        shapes = memento.getState();
    }

    public void display() {
        System.out.println("Canvas: " + shapes);
    }
}
