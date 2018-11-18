package com.java.designpattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**Shopping Cart and payment method will require input as Payment strategy.*/
public class ShoppingCart {

	//List of items
	List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<>();
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}

	public int calculateTotal() {
		int sum = 0;

		for(Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	/**Payment method of shopping cart requires payment algorithm as argument and doesn’t store it anywhere as instance variable.*/
	public void pay(PaymentStrategy paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}
