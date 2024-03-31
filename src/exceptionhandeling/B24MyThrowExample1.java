package exceptionhandeling;

public class B24MyThrowExample1 {

	public static void main(String[] args) {
		
		//create or generate new exception
		int i = 30;
		
		if(i>40) {
			System.out.println("Student is passed");
		}else {
			//throw new ArithmeticException("Student failed");
			//we can use other exception types as well.
			//new... is parameterized constructor
			throw new NullPointerException("Student failed in Exception");
		}
			
	}
}
