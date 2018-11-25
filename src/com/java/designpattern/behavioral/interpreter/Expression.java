package com.java.designpattern.behavioral.interpreter;

/**Different types of Expressions that will consume the interpreter context class.*/
public interface Expression {
	String interpret(InterpreterContext ic);
}
