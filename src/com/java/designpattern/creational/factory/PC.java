package com.java.designpattern.creational.factory;

/**
 * The Class PC.
 */
public class PC extends Computer {

	/** The ram. */
	private int ram;
	
	/** The cpu. */
	private double cpu;
	
	/** The hdd. */
	private int hdd;

	/**
	 * Instantiates a new pc.
	 *
	 * @param ram the ram
	 * @param hdd the hdd
	 * @param cpu the cpu
	 */
	public PC(int ram,int hdd, double cpu){
		this.ram = ram;
		this.hdd= hdd;
		this.cpu = cpu;
	}

	/* (non-Javadoc)
	 * @see com.java.designpattern.factory.Computer#getRam()
	 */
	public int getRam(){
		return this.ram;
	}
	
	/* (non-Javadoc)
	 * @see com.java.designpattern.factory.Computer#getCpu()
	 */
	public double getCpu(){
		return this.cpu;
	}

	/* (non-Javadoc)
	 * @see com.java.designpattern.factory.Computer#getHdd()
	 */
	public int getHdd(){
		return this.hdd;
	}
}
