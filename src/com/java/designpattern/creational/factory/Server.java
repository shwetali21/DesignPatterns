package com.java.designpattern.creational.factory;

public class Server extends Computer {
	
	private int  ram;
	private double cpu;
	private int  hdd;

	public Server(int ram,int hdd,double cpu) {
		this.ram = ram;
		this.hdd= hdd;
		this.cpu = cpu;
	}
	
	public int getRam() {
		return this.ram;
	}
	
	public double getCpu() {
		return this.cpu;
	}

	public int getHdd() {
		return this.hdd;
	}
}