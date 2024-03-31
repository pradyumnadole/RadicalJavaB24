package Excercise;

public class MyAdditionAndSubtractionTest {

	/*
	 * Write java program to addition and substraction of two numbers. . Use
	 * addition() and substraction() method to complete this .. you have create two
	 * different classes 1 will have main method and 2nd will have addition() and
	 * substraction() method
	 */
	public static void main(String[] args) {

		MyAdditionProgram obj = new MyAdditionProgram();
		int result = obj.addition(100, 200);
		System.out.println("Result of addition is " + result);
		
		System.out.println("=============================== ");
		
		MySubtractionProgram obj1 = new MySubtractionProgram();
		int result1 = obj1.subtraction(900, 50);
		System.out.println("Result of subtraction is " + result1);
		
		addition(100,50);
		sub(100,50);

	}

	public static int addition (int a, int b) {
		int c = a +b;
		System.out.println(c);
		return c;
		
		
	}
	
	public static int sub (int a, int b) {
		int c = a -b;
		System.out.println(c);
		return c;
		
		
	}
	
}
