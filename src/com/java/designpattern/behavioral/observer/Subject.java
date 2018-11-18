package com.java.designpattern.behavioral.observer;

/*The base Subject interface that defines the contract methods to be implemented by any concrete subject.*/
public interface Subject {

	//methods to register and unregister observers
	public void register(Observer obj);
	public void unregister(Observer obj);

	//method to notify observers of change
	public void notifyObservers();

	//method to get updates from subject
	public Object getUpdate(Observer obj);
}
