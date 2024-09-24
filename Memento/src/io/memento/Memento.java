package io.memento;

import java.util.List;

import java.util.ArrayList;


class Memento {
    private final List<String> state;

    public Memento(List<String> state) {
        this.state = new ArrayList<>(state);
    }

    public List<String> getState() {
        return state;
    }
}
