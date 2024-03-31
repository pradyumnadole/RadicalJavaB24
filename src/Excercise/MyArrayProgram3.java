package Excercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayProgram3 {
	/*
	 * Write a Array program to check if specific values ("Sachin","Virat") are
	 * present And Also print their position
	 */

	public static void main(String[] args) {
		String[] myStrArray = { "Surbhi", "Pradyumna", "Prasad", "supriya", "Virat", "sayali", "Sachin", "Shruti",
				"Saurabh" };
		int len = myStrArray.length;
		int index = 0;

//		for (String string : myStrArray) {
//			if (string.equals("Sachin")) {
//				//System.out.println("Sachin Value is present & it is at position " +  [strin]);
//			System.out.println("Sachin Value is present & it is at position " + Arrays.asList(myStrArray).indexOf(string));	
//			}
//			else if(string.equals("Virat")) {
//			System.out.println("Virat Value is present & it is at position " + Arrays.asList(myStrArray).indexOf(string));	
//			}
//			
//		}
		String s1 = "Sachin";
		String s2 = "Virat";
		for (int i = 0; i < len; i++) {
			if (s1.equals(myStrArray[i])) {
				index = i;
				System.out.println("Sachin Value is present & it is at position " + index);

			} else if (s2.equals(myStrArray[i])) {
				index = i;
				System.out.println("Virat Value is present & it is at position " + index);
			}

		}

	}

}
