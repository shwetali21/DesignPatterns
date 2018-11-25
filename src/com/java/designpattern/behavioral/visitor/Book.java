package com.java.designpattern.behavioral.visitor;

/**Concrete class for different types of items - Book
The implementation of accept() method in concrete classes, its calling visit() method of Visitor and passing itself as argument.
 * */
public class Book implements ItemElement {

	private int price;
	private String isbnNumber;

	public Book(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
