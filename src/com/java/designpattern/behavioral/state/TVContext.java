package com.java.designpattern.behavioral.state;

/**State Design Pattern Context Implementation.
 * Context also implements State and keeps a reference of its current state and
 * forwards the request to the state implementation.
 * */
public class TVContext implements State {

	private State tvState;

	public State getState() {
		return tvState;
	}

	public void setState(State state) {
		this.tvState = state;
	}

	@Override
	public void doAction() {
		this.tvState.doAction();
	}
}
