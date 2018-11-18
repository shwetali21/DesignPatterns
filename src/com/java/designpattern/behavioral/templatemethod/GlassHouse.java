package com.java.designpattern.behavioral.templatemethod;

//Template Method Concrete Classes
public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls.");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating.");
	}
}
