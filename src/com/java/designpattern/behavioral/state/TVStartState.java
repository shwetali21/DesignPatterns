package com.java.designpattern.behavioral.state;

/**State Design Pattern Concrete State Implementation.*/
public class TVStartState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned ON.");
	}
}
