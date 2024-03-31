package oopsconcepts.myconstructorB24;

public class MyParameterizedConstructorTest {
	//This is example of Parameterized constructor

	public static void main(String[] args) {
		MyParameterizedConstructor obj1 = new MyParameterizedConstructor(10, "Priya");
		System.out.println("value of i " + obj1.i);
		System.out.println("value of name " + obj1.name);

		MyParameterizedConstructor obj2 = new MyParameterizedConstructor(20, "PD");
		System.out.println("value of i " + obj2.i);
		System.out.println("value of name " + obj2.name);
	}

}
