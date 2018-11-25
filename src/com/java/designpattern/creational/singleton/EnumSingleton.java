package com.java.designpattern.creational.singleton;

/**To overcome the situation with Reflection(to destroy singleton implementation), 
 * Joshua Bloch suggests the use of Enum to implement Singleton design pattern 
 * as Java ensures that any enum value is instantiated only once in a Java program.*/
public enum EnumSingleton {

	INSTANCE;

	public EnumSingleton getInstance() {
		return INSTANCE;
	}
}
