package com.java.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**Composite object:
 * A composite object contains group of leaf objects and we should provide some helper methods to add or delete leafs from the group.
 * We can also provide a method to remove all the elements from the group
 */
public class Drawing implements Shape {

	//collection of Shapes
	private List<Shape> shapes = new ArrayList<>();

	@Override
	public void draw(String fillColor) {
		shapes.forEach(shape -> shape.draw(fillColor));
	}

	//adding shape to drawing
	public void add(Shape shape) {
		this.shapes.add(shape);
	}

	//removing shape from drawing
	public void remove(Shape shape) {
		shapes.remove(shape);
	}

	//removing all the shapes
	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
/**Composite also implements component and behaves similar to leaf except that it can contain group of leaf elements.*/
