package com.java.designpattern.creational.builder;

public class TestBuilder {

	public static void main(String[] args) {

		Computer comp = new Computer.ComputerBuilder("500 GB","2 GB")
									.setBluetoothEnabled(true)
									.setGraphicsCardEnabled(true)
									.build();

		System.out.println(comp.toString());
	}
}