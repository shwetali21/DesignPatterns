package com.java.designpattern.behavioral.interpreter;

/** Interpreter context class that will do the actual interpretation.*/
public class InterpreterContext {

	public String getBinaryFormat(int i) {
		return Integer.toBinaryString(i);
	}

	public String getHexadecimalFormat(int i) {
		return Integer.toHexString(i);
	}
}
