package com.java.designpattern.creational.singleton;

class SingletonThreadSafeInstance {

	//private static variable
	private static SingletonThreadSafeInstance instance;

	//private constructor
	private SingletonThreadSafeInstance() {}

	// public static method that returns the instance of the class
	public static synchronized SingletonThreadSafeInstance getInstance() {

		if(instance == null) {
			instance = new SingletonThreadSafeInstance();
		}
		return  instance;
	}
}

/**
 * The Class SingletonThreadSafe.
 */
public class SingletonThreadSafe {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		SingletonThreadSafeInstance singletonThread = SingletonThreadSafeInstance.getInstance();

		System.out.println(singletonThread);

		// Now let's instanciate another class
		SingletonThreadSafeInstance singletonThread1 = SingletonThreadSafeInstance.getInstance();

		System.out.println(singletonThread1);

		//Now check out your console.... What the hell, the two instances have the same reference :o
	}
}

