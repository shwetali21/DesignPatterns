package com.java.designpattern.structural.proxy;

public class TestProxy {
	public static void main(String[] args) {
		ExpensiveObject object = new ExpensiveObjectProxy();
		object.process();
		object.process();
	}
}
