package com.java.designpattern.behavioral.chainofresponsibility;

/* Class Currency that will store the amount to dispense and used by the chain implementations.*/
public class Currency {

	private int amount;

	public Currency(int amt) {
		this.amount = amt;
	}

	public int getAmount() {
		return this.amount;
	}
}
