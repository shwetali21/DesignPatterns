package com.java.designpattern.structural.adapter;

/**Building an adapter that can produce 3 volts, 12 volts and default 120 volts.
 * So first of all we will create an adapter interface with these methods.*/
public interface SocketAdapter {
	
	Volt get120Volt();
	Volt get12Volt();
	Volt get3Volt();
}
