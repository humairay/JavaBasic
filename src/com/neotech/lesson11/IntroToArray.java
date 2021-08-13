package com.neotech.lesson11;

public class IntroToArray {

	public static void main(String[] args) {

		//data type      indentifier           assignment operator			value
		int                  num                 = 								10; 
		
		//2nd way
		//declare
		int num1;
		//initialize
		num1 = 10;
		
		
		//declare array
		int[] array;
		//initialization
		array = new int[5];
		
		//2nd way
		int[] array2 = new int[5];
		
		//how do we store values in an array?
		
		array[0] = 10;
		// [ 10 ] [ ] [ ] [ ] [ ] 
		array[2] = 30;
		// [ 10 ] [ ] [ 30 ] [ ] [ ] 
		array[1] = 20;
		// [ 10 ] [ 20 ] [ 30 ] [ ] [ ] 
		array[3] = 40;
		// [ 10 ] [ 20 ] [ 30 ] [ 40 ] [ ] 
		array[4] = 50; 
		// [ 10 ] [ 20 ] [ 30 ] [ 40 ] [ 50 ]   
		
		
		//access array element
		System.out.println(array[4]);
		
		
		String[] strArray = new String[4];
		
		strArray[0] = "New York";
		// [  "New York"    ,          ,               ,            ]
		strArray[1] = "New Jersey";
		// [  "New York"    ,   "New Jersey"   ,               ,            ]
		strArray[3] = "Pennsilvania";
		// [  "New York"    ,   "New Jersey"   ,               ,     "Pennsilvania" ]
		strArray[2] = "Connecticut";
		// [  "New York"    ,   "New Jersey"   ,  "Connecticut"  ,     "Pennsilvania" ]
		
		System.out.println("I live in "+ strArray[1]);
		
	//	strArray[30] = "California";  //every index out of [0 to 3] will give error because size is 4.
		
		
		
		char[] letters = new char[6];
		
		letters[0] = 'B';
		letters[5] = 'A';
		letters[4] = 'C';  //value is C
  		letters[1] = 'X';
		letters[3] = 'Y';
		
		System.out.println("Letter at index 4 is " + letters[4]);
		
		letters[4] = 'D'; //C is overriden so now its D
		
		System.out.println("Letter at index 4 is "+ letters[4]);
		

	}

}
