package com.java.designpattern.behavioral.command;

/**Concrete command classes BuyStock implementing Order interface which will do actual command processing.*/
public class BuyStock implements Order {

	private Stock newStock;

	public BuyStock(Stock newStock) {
		this.newStock = newStock;
	}

	public void execute() {
		newStock.buy();
	}
}
