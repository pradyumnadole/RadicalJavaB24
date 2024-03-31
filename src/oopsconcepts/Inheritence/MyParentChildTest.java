package oopsconcepts.Inheritence;

public class MyParentChildTest {

	public static void main(String[] args) {
		B24ParentClass obj = new B24ParentClass();
		obj.method1();
		obj.method2();
		obj.common(); 
		/*
		 * if common method is present in all classes, since object is created for
		 * class it will common from the class.
		 */
		System.out.println("==============");
		//example of single inheritence
		B24ChildClass obj1 = new B24ChildClass();
		obj1.method3();
		obj1.method1(); //method accessed through inheritence from parent class
		obj1.method2(); //method accessed through inheritence from parent class
		obj1.common();
		System.out.println("==============");
		
		//example of multilevel inheritence
		B24GrandChildClass obj2 = new B24GrandChildClass();
		obj2.method1(); //method accessed through inheritence from parent class
		obj2.method2(); //method accessed through inheritence from parent class
		obj2.method3(); //method accessed through inheritence from child class
		obj2.method4(); 
		obj2.method5(); 
		obj2.common();
		
	}

}
