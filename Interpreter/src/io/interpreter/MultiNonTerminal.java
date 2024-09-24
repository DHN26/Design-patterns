package io.interpreter;

public class MultiNonTerminal implements Expression{

	private Expression left;
	private Expression right;
	
	public MultiNonTerminal(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int interpreter(Context c) {
		return left.interpreter(c)*right.interpreter(c);
	}
	
}
