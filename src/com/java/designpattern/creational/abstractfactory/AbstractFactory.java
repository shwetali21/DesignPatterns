package com.java.designpattern.creational.abstractfactory;

public interface AbstractFactory {
	
    Animal getAnimal(String animalType) ;
    Color getColor(String colorType);
}
