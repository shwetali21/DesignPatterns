package com.java.designpattern.behavioral.strategy;

/**Concrete implementation of algorithms for payment through PayPal.*/
public class PayPalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;

	public PayPalStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

	@Override
	public String toString() {
		return "PayPalStrategy [emailId=" + emailId + ", password=" + password + "]";
	}
}
