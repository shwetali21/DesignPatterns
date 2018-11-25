package com.java.designpattern.behavioral.state;

/**Example without using State Pattern.
 * 
 * Client code should know the specific values to use for setting the state of remote. 
 * Further more if number of states increase then the tight coupling between implementation and 
 * the client code will be very hard to maintain and extend.
 **/
public class TVRemoteBasic {

	private String state = "";

	public void setState(String state) {
		this.state = state;
	}

	public void doAction() {
		if(state.equalsIgnoreCase("ON")) {
			System.out.println("TV is turned ON.");
		} else if(state.equalsIgnoreCase("OFF")) {
			System.out.println("TV is turned OFF");
		}
	}

	public static void main(String[] args) {
		TVRemoteBasic remote = new TVRemoteBasic();

		remote.setState("ON");
		remote.doAction();

		remote.setState("OFF");
		remote.doAction();
	}
}
