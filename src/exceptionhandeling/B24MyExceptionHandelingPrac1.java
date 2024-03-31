package exceptionhandeling;

public class B24MyExceptionHandelingPrac1 {

	void method1 () throws Exception {
		int i=40;
		int j =40/0;
	}
	
	
	public static void main(String[] args) {
		B24MyExceptionHandelingPrac1 obj = new B24MyExceptionHandelingPrac1();
		try {
			obj.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
