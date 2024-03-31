package Excercise;

public class MyArrayProgram4 {
	/*
	 * Write a Array program to check if specific values ("Sachin","Virat") are
	 * present If element not present then output should say, element not present
	 */

	public static void main(String[] args) {
		String[] myStrArray = { "Surbhi", "Pradyumna", "Sachin", "Sachin", "Virat", "sayali", "XYZ", "Shruti",
				"Saurabh" };
		int len = myStrArray.length;
		//System.out.println(myStrArray [12]); //Exception - Index out of bound 

		for (int i = 0; i < len; i++) {
			if (myStrArray[i].equals("Sachin")) {
				System.out.println("***Sachin is present in array & its index position is " + i);

			} else if (myStrArray[i].equals("Virat")) {
				System.out.println("***Virat is present in array & its index position is " + i);

			} else {
				System.out.println("==Element is not present in array & its index position is " + i);
			}
		}

	}

}
