package io.visitor;

public interface Element {

	void accept(Visitor visitor);
}
