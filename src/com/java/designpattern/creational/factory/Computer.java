package com.java.designpattern.creational.factory;

public abstract class Computer {

	public abstract int getRam();
	public abstract double getCpu();
	public abstract int getHdd();

	@Override

	public String toString(){
		return "Config :: RAM = " + this.getRam() + " CPU = " + this.getCpu() + " HDD = " + this.getHdd();
	}
}
