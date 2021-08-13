package com.neotech.lesson24;

public class FileTest {

	public static void main(String[] args) {

//		File fl = new File(); //CE: cannot instantiate this class

		// upcasting
		File javaFile = new JavaFile();

		// we declare an array of int. Java does not know that 3 is an int
		// but because you put it there, it becomes an int
		int[] grades = { 3, 4, 5, 6, 3, 4 };

		String[] strArray = { "str1", "str2", "str3", new String("str4") };

		// when we declare objects inside here, they are automatically upcasted
		File[] files = { new JavaFile(), new WordFile(), new PdfFile() };

		for (File f : files) {
			f.open();
			System.out.println("========================");
		}
		//Can we downcast in the loop??
		// first loop: object of JavaFile ---> can only downcast to JavaFile object
		// second loop: object of WordFile --> " -              - " WordFile object

		// another way
		File jFile = new JavaFile();
		File wFile = new WordFile();
		File pFile = new PdfFile();

		File[] files2 = { jFile, wFile, pFile };

	}

}
