package Excercise;

public class MyFinalClass { 
//final class MyFinalClass { 
//if we create final class then we can not extend it.

	//final int i =40;//if we assign final to variable then we can not override it.
	
	final void method1() {
	//if we create final method then it can not be overridden
		int i = 20;
		System.out.println("from final method");
		//i = 100; //if we assign final to variable then we can not override it.
		//System.out.println("value of is i " + i);
	}
	
}
