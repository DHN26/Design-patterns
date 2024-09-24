package io.interpreter;

public class TerminalExpression implements Expression{

	private int num;
	
	public TerminalExpression(int num)
	{
		this.num=num;
	}
	@Override
	public int interpreter(Context c) {
		return num;
		
	}

}
