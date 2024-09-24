package io.interpreter;

public class Client {

	public static void main(String[] args) {

		String expression = "2 + 3 * 4";

		Context context = new Context(expression);
		Interpreter interpreter = new Interpreter(context);

		int result = interpreter.interpret(expression);
		System.out.println("Result: " + result);
	}

}
