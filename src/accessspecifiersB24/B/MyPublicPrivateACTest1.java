package accessspecifiersB24.B;

import accessspecifiersB24.A.MyPublicPrivateAS;

public class MyPublicPrivateACTest1 {

	public static void main(String[] args) {
		MyPublicPrivateAS obj = new MyPublicPrivateAS();
		
		System.out.println("value of i " + obj.i);
		obj.method1();
		
		//System.out.println("value of k "+obj.k); //default variable value is not accessible since package is different
		//obj.method3();//default method value is not accessible since package is different

	}

}
