package com.java.designpattern.behavioral.interpreter;

/**Expression implementation to convert int to binary*/
public class IntToBinaryExpression implements Expression {

	private int i;

	public IntToBinaryExpression(int number) {
		this.i = number;
	}

	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getBinaryFormat(i);
	}
}
