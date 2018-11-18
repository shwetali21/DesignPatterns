package com.java.designpattern.behavioral.strategy;

/**Concrete implementation of algorithms for payment using credit card.*/
public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardStrategy(String nme, String ccNum, String cvv, String expiryDate) {
		this.name = nme;
		this.cardNumber = ccNum;
		this.cvv = cvv;
		this.dateOfExpiry = expiryDate;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount +" paid with Credit/Debit card.");
	}
}
