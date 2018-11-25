package com.java.designpattern.behavioral.memento;

/**Caretaker is the helper class that is responsible for storing and restoring the Originator’s state through Memento object. 
 * Since Memento is private to Originator, 
 * Caretaker can’t access it and it’s stored as an Object within the caretaker.*/
public class FileWriterCaretaker {

	private Object obj;

	public void save(FileWriterUtil fileWriter) {
		this.obj = fileWriter.save();
	}

	public void undo(FileWriterUtil fileWriter) {
		fileWriter.undoToLastSave(obj);
	}
}
