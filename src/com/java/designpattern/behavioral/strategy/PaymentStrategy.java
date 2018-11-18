package com.java.designpattern.behavioral.strategy;

/**interface for our strategy pattern, in our case to pay the amount passed as argument.*/
public interface PaymentStrategy {
	
	public void pay(int amount);
}
