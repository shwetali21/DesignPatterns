package com.java.designpattern.creational.singleton;

/**In eager initialization, the instance of Singleton Class is created at the time of class loading.*/
public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

	//private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {}

	public static EagerInitializedSingleton getInstance() {
		return INSTANCE;
	}
}
