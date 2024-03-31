package Excercise;

public class MyDoWhileProgram1 {

	public static void main(String[] args) {
		// Program to display 1 to 20 numbers using do...while
		int i = 1;
		do {
			System.out.println("value of i " + i);
			i++;
		} while (i < 20);
		System.out.println("=======================");

		// Program to display 1 to 20 numbers using only while loop

		int j = 1;
		while (j <= 20) {
			System.out.println("value of j " + j);
			j++;
		}

	}

}
