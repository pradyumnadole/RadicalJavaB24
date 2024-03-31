package accessspecifiersB24.A;

public class MyPublicPrivateAS {

	public int i = 10;
	private int j = 20;
	int k =  30;// default variable not public/private


	public void method1() {
		System.out.println("value from method1");
	}

	private void method2() {
		System.out.println("value from method2");

	}
	
	 void method3() {
		System.out.println("value from method3");//default method

	}

	public static void main(String args[]) {
		MyPublicPrivateAS obj1 = new MyPublicPrivateAS();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		obj1.method1();
		obj1.method2();
	}

}
