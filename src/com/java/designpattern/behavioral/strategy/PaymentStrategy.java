package com.java.designpattern.behavioral.strategy;

/**Interface for our strategy pattern, in our case to pay the amount passed as argument.*/
public interface PaymentStrategy {

	void pay(int amount);
}
