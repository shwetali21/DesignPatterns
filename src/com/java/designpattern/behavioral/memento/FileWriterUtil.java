package com.java.designpattern.behavioral.memento;

/**Originator object - FileWriterUtil, whose state needs to be saved and restored and it uses an inner class to save the state of Object.
 * The inner class is called Memento and it�s private, so that it can�t be accessed from other objects.
 */
public class FileWriterUtil {

	private String fileName;
	private StringBuilder content;

	public FileWriterUtil(String fileName) {
		this.fileName = fileName;
		this.content = new StringBuilder();
	}

	@Override
	public String toString() {
		return this.content.toString();
	}

	public void write(String str) {
		content.append(str);
	}

	public Memento save() {
		return new Memento(this.fileName, this.content);
	}

	public void undoToLastSave(Object obj) {
		Memento memento = (Memento) obj;
		this.fileName = memento.fileName;
		this.content = memento.content;
	}

	//Memento inner class and implementation of save and undo methods.
	private class Memento {

		private String fileName;
		private StringBuilder content;

		public Memento(String fileName, StringBuilder content) {
			this.fileName = fileName;
			//notice the deep copy so that Memento and FileWriterUtil content variables don't refer to same object
			this.content = new StringBuilder(content);
		}
	}
}
