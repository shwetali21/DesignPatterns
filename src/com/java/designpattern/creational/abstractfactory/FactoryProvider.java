package com.java.designpattern.creational.abstractfactory;

public class FactoryProvider {
	public static AbstractFactory getFactory(String choice){

		if("Animal".equalsIgnoreCase(choice)) {
			return new AnimalFactory();
		}
		else if("Color".equalsIgnoreCase(choice)) {
			return new ColorFactory();
		}

		return null;
	}

	public static void main(String[] args) {
		//FactoryProvider animalProvider = new FactoryProvider();
		//AbstractFactory animalFactory = animalProvider.getFactory("Animal");
		FactoryProvider.getFactory("Animal");
		
		//FactoryProvider colorProvider = new FactoryProvider();
		//AbstractFactory colorFactory = colorProvider.getFactory("Color");
		FactoryProvider.getFactory("Color");
	}
}
