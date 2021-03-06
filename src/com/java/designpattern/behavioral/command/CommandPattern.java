package com.java.designpattern.behavioral.command;

/**Use the Broker class to take and execute commands.*/
public class CommandPattern {

	public static void main(String[] args) {
		Stock newStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(newStock);
		SellStock sellStockOrder = new SellStock(newStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
