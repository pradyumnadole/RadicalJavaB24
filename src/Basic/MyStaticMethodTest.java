package Basic;

public class MyStaticMethodTest {

	public static void main(String[] args) {
		//static methods and variable are called without object creation.
		
		int val = MyStaticMethod.j;
		MyStaticMethod.method1();
		MyStaticMethod.method2();
	
		MyStaticMethod obj = new MyStaticMethod();
		int k = obj.i; //for non static variable object creation is needed
		int l = obj.j;
		obj.method1();
		obj.method2();
		obj.method3();//for non static method object creation is needed
	}

}
