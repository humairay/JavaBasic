package com.neotech.lesson24;

public abstract class File {

	/*
	 * 
	 * Create a class File that will have the following behaviors: open, edit,
	 * close. Edit and close are implemented method while open is an abstract.
	 * Create 3 subclasses: JavaFile , WordFile , PdfFile that will provide specific
	 * implementation of open behaviour : Example: to open .java file we need
	 * notepad++ or sublime text, to open .doc file we need Microsoft word to be
	 * installed etc
	 * 
	 */

	public abstract void open();

	public void edit() {
		System.out.println("File can be edited!!");
	}

	public void close() {
		System.out.println("File can be closed!!");
	}

}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("Java files can be opened using notepad++.");
	}

}

class WordFile extends File {

	@Override
	public void open() {

		System.out.println("Word files are opened using MS Word.");
	}

}

class PdfFile extends File {

	@Override
	public void open() {
		System.out.println("PDF files can be opened using Acrobat Reader");

	}

}
