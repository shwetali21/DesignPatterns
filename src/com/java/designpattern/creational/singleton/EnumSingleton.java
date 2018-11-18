package com.java.designpattern.creational.singleton;

public enum EnumSingleton {

	INSTANCE;

	public EnumSingleton getInstance() {
		return INSTANCE;
	}
}
