package accessspecifiersB24.A;

public class MyProtectedASTest extends MyProtectedAS {

	public static void main(String[] args) {
		MyProtectedAS obj = new MyProtectedAS();
		System.out.println("value of protected variable in same package " + obj.i);
		obj.method4();
		
	}

}
