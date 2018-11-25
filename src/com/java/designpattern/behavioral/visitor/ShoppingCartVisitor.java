package com.java.designpattern.behavioral.visitor;

/**Visitor interface*/
public interface ShoppingCartVisitor {

	/**visit() method for different type of items in Visitor interface that will be implemented by concrete visitor class.*/
	int visit(Book book);
	int visit(Fruit fruit);
}
