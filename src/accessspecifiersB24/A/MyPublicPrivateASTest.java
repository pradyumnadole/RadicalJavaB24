package accessspecifiersB24.A;

public class MyPublicPrivateASTest {

	public static void main(String[] args) {
		MyPublicPrivateAS obj = new MyPublicPrivateAS();
		System.out.println("value of i " + obj.i);
		obj.method1();
		
		System.out.println("value of k "+obj.k); //default variable value
		obj.method3();//default method value
	}

}
