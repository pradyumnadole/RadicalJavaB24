package Excercise;

public class MyConstructorProgram1Test {

	public static void main(String[] args) {
		//default constructor
		MyConstructorProgram1 obj = new MyConstructorProgram1();
		System.out.println("Volume from default constructor = " + obj.volume);
		System.out.println("=======");
		//parameterized constructor
		MyConstructorProgram1 obj1 = new MyConstructorProgram1(6.5, 4.5, 8.5);
		System.out.println("Volume from parameterized constructor = " + obj1.volume1);
		//private constructor can not be initialized
		//MyPrivateConstructor obj2 = new MyPrivateConstructor();
	}

}
