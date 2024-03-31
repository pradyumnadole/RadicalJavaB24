package accessspecifiersB24.B;

import accessspecifiersB24.A.MyProtectedAS;
//import oopsconcepts.Encapsulation.B24MyEncapsulation;

public class MyProtectedASTest1 extends MyProtectedAS{
//public class MyProtectedASTest1 extends B24MyEncapsulation{
	public static void main(String[] args) {
		
		MyProtectedASTest1 obj = new MyProtectedASTest1();
		System.out.println("value of protected variable in outside package " + obj.i);
		obj.method4();
		
//		B24MyEncapsulation obj1 = new B24MyEncapsulation();
//		obj1.
		//Not able to access protected variable/method outside package but 
		//possible with extend i.e inheritence

	}

}
