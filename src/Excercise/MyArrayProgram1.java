package Excercise;

public class MyArrayProgram1 {
//Write a Array program to check if specific values (5,9) are present
	public static void main(String[] args) {
		int[] myArray = { 2, 5, 7, 79, 10, 9, 5, 6, 70, 34, 56, 9, 8 };
		for (int i : myArray) {
			if (i == 5) {
				System.out.println("Array contains value 5");
			} else if (i == 9) {
				System.out.println("Array contains value 9");
			} 

		}

	}

}
