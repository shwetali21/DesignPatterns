package com.java.designpattern.creational.factory;

public class FactoryClass {

	public static Computer getComputer(String c, int ram, int hdd, double dd) {
		
		//PC and Server classes extend from Computer.
		if("PC".equalsIgnoreCase(c)) 
			return new PC(ram, hdd, dd);
		else if("Server".equalsIgnoreCase(c)) 
			return new Server(ram, hdd, dd);

		return null;
	}

	public static void main(String[] args) {
		
	    Computer comp1 = FactoryClass.getComputer("PC", 16, 499, 4.3);
	    System.out.println(comp1);


	    Computer comp2 = FactoryClass.getComputer("Server", 30, 900,9);
	    System.out.println(comp2);

	  //Now you can see the output in your console.
	}
}

/*Output:
Config :: RAM = 16 CPU = 4.3 HDD = 499
Config :: RAM = 30 CPU = 9.0 HDD = 900*/