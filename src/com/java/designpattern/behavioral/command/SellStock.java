package com.java.designpattern.behavioral.command;

/**Concrete command classes SellStock implementing Order interface which will do actual command processing.*/
public class SellStock implements Order {

	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}
