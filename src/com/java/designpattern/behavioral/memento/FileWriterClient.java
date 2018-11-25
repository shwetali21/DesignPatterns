package com.java.designpattern.behavioral.memento;

/**Program to implement Memento Pattern.*/
public class FileWriterClient {

	public static void main(String[] args) {

		FileWriterCaretaker caretaker = new FileWriterCaretaker();

		FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
		fileWriter.write("First Set of Data.\n");
		System.out.println(fileWriter);

		//Save the file
		caretaker.save(fileWriter);

		//Write another set of data
		fileWriter.write("Second Set of Data.\n");

		//Check file Contents
		System.out.println(fileWriter);

		//Undo to last save
		caretaker.undo(fileWriter);

		System.out.println(fileWriter);
	}
}
