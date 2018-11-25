package com.java.designpattern.behavioral.command;

/**Concrete command classes SellStock implementing Order interface which will do actual command processing.*/
public class SellStock implements Order {

	private Stock newStock;

	public SellStock(Stock newStock) {
		this.newStock = newStock;
	}

	public void execute() {
		newStock.sell();
	}
}
