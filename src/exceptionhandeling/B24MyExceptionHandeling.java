package exceptionhandeling;

public class B24MyExceptionHandeling {

	public static void main(String[] args) {
		System.out.println("Starting of method");
		try {
			System.out.println("Start of try block");
//			String [] myStrArray  = {"A","B","C"};
//			int k = myStrArray.length;
//			for (int l=0;l<=k;l++) {
//				System.out.println("Value is " + myStrArray[l]);
//			}
			// Program halt at very first error
			int i = 10;
			int j = i / 0;
			System.out.println("end of try block");
			// above didn't get executed since prgm halted at line 15
		}catch (ArithmeticException obj) {
			System.out.println("ArithmeticException in catch block" +obj.toString());
		}catch (NullPointerException obj) {
			System.out.println("NullPointerException in catch block"+obj.toString());
		}catch (Exception obj) {
			System.out.println("Exception in catch block" + obj.toString());
		}
		//we can have multiple catch blocks in same try..catch
		
		System.out.println("End of method");
	}

}
