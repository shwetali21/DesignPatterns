package com.java.designpattern.behavioral.mediator;

/*Mediator interface that will define the contract for concrete mediators.*/
public interface ChatMediator {

	void sendMessage(String msg, User user);
	void addUser(User user);
}