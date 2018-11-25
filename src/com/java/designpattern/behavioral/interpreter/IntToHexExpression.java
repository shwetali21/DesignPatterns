package com.java.designpattern.behavioral.interpreter;

/**Expression implementation to convert int to hexadecimal*/
public class IntToHexExpression implements Expression {

	private int i;

	public IntToHexExpression(int number) {
		this.i = number;
	}

	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getHexadecimalFormat(i);
	}
}
