package com.java.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**Class Broker is created which acts as an invoker object. It can take and place orders.*/
public class Broker {

	private List<Order> orderList = new ArrayList<>(); 

	public void takeOrder(Order order) {
		orderList.add(order);		
	}

	public void placeOrders() {
		orderList.forEach(Order::execute);
		orderList.clear();
	}
}
