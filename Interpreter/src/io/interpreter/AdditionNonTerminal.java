package io.interpreter;

public class AdditionNonTerminal implements Expression{
	private Expression left;
	private Expression right;
	
	public AdditionNonTerminal(Expression left, Expression right)
	{
		this.left=left;
		this.right=right;
	}

	@Override
	public int interpreter(Context c) {
		return left.interpreter(c)+right.interpreter(c);
	}

}
