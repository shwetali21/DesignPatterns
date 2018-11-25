package com.java.designpattern.structural.proxy;

/**Utilize the Proxy pattern and initialize our object on demand.
 * */
public class ExpensiveObjectProxy implements ExpensiveObject {

	private static ExpensiveObject object;

	@Override
	public void process() {
		if (object == null) {
			object = new ExpensiveObjectImpl();
		}
		object.process();
	}
}

/**Whenever our client calls the process() method, they’ll just get to see the processing 
 * and the initial configuration will always remain hidden
 */