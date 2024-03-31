package Excercise;

public class MyArrayProgram2 {

	public static void main(String[] args) {
		//Write a Array program to print only the first value from (5 OR 9) are present
		int[] myNew = { 2, 5, 9, 5, 7, 9, 10, 98, 6, 7, 34, 56, 9, 8 };

		int len = myNew.length;

		for (int i = 0; i < len; i++) {
			if (myNew[i] == 5) {
				System.out.println("Array contains value " + myNew[i]);
				break;

			} else if (myNew[i] == 9) {
				System.out.println("Array contains value " + myNew[i]);
				break;
			}
		}
	}
}
