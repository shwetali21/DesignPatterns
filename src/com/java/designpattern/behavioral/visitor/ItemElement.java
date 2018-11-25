package com.java.designpattern.behavioral.visitor;

/**To implement visitor pattern, 
 * create different type of items (Elements) to be used in shopping cart.*/
public interface ItemElement {

	int accept(ShoppingCartVisitor visitor);
}
