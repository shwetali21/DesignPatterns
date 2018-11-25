package com.java.designpattern.structural.proxy;

/**implementation of the interface with a large initial configuration.*/
public class ExpensiveObjectImpl implements ExpensiveObject {

	public ExpensiveObjectImpl() {
		heavyInitialConfiguration();
	}

	@Override
	public void process() {
		System.out.println("processing complete.");
	}

	private void heavyInitialConfiguration() {
		System.out.println("Loading initial configuration...");
	}
}
