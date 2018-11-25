package com.java.designpattern.behavioral.interpreter;

/**Client application that will parse the user input and pass it to correct expression 
 * and then use the output to generate the user response.*/
public class InterpreterClient {

	private InterpreterContext ic;

	public InterpreterClient(InterpreterContext ic) {
		this.ic = ic;
	}

	public String interpret(String str) {
		Expression exp;

		//Create rules for Expression
		if(str.contains("Hexadecimal")) 
			exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		else if(str.contains("Binary")) 
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		else 
			return str;

		return exp.interpret(ic);
	}

	public static void main(String args[]){
		String str1 = "28 in Binary";
		String str2 = "28 in Hexadecimal";

		InterpreterClient ec = new InterpreterClient(new InterpreterContext());
		System.out.println(str1 + " = " + ec.interpret(str1));
		System.out.println(str2 + " = " + ec.interpret(str2));

	}
}
