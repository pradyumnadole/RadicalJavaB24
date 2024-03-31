package exceptionhandeling;

public class B24MyExceptionHandeling2 {
	//if  we use different catch than exception, finally block will get executed
	//Error will not be caught
	//Finally will be used even if error is caught or not
	public static void main(String[] args) {
		
		System.out.println("Starting of method");
		try {
			System.out.println("Starting of try ");
			String [] myArray = {"Test1","Test2","Test3"};
			int i = myArray.length;
			for(int k=0;k<=i;k++) {
				System.out.println("Value is "+ myArray[k]);
			}
			System.out.println("end of try");
		} catch (NullPointerException e) {
			System.out.println("Error is " +e.toString());
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("end of method");
	}

}
