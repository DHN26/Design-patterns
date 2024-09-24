package io.interpreter;

public class Interpreter {

	private Context context;

	public Interpreter(Context context) {
		this.context = context;
	}

	public int interpret(String expression) {

		Expression expressionTree = buildExpressionTree(expression);
		return expressionTree.interpreter(context);
	}

	private Expression buildExpressionTree(String expression) {

		return new AdditionNonTerminal(new TerminalExpression(2),
				new MultiNonTerminal(new TerminalExpression(3), new TerminalExpression(4)));
	}

}
