package com.java.designpattern.behavioral.visitor;

/**Visitor Pattern Program.*/
public class ShoppingCartClient {
	
	public static void main(String[] args) {

		ItemElement[] items = new ItemElement[] {
				new Book(95, "1256"),
				new Book(100, "1588"),
				new Fruit(10, 2, "Banana"),
				new Fruit(40, 1, "Apple")
		};

		int total = calculatePrice(items);
		System.out.println("Total Cost : " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;

		for(ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}
