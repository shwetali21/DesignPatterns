package com.java.designpattern.creational.prototype;

import java.util.List;

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employees emps = new Employees();
		emps.loadData();

		//Use the clone method to get the Employee object
		Employees newEmp1 = (Employees) emps.clone();
		Employees newEmp2 = (Employees) emps.clone();

		List<String> list1 = newEmp1.getEmpList();
		list1.add("John");

		List<String> list2 = newEmp2.getEmpList();
		list2.remove("Pankaj");

		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list1);
		System.out.println("empsNew1 List: " + list2);
	}
}
