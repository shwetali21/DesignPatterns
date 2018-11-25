package com.java.designpattern.behavioral.visitor;

/**Implementation visitor interface and every item will have it’s own logic to calculate the cost.*/
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	//Book item has its own logic to calculate the cost.
	@Override
	public int visit(Book book) {
		int cost = 0;

		//apply 5$ discount if book price is greater than 50
		if(book.getPrice() > 50) 
			cost = book.getPrice() - 5;
		else 			
			cost = book.getPrice();

		System.out.println("Book ISBN :: " + book.getIsbnNumber() + ", cost = " + cost);
		return cost;
	}

	//Fruit item has its own logic to calculate the cost.
	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("Fruit :: " + fruit.getName() + ", cost = " + cost);
		return cost;
	}
}
