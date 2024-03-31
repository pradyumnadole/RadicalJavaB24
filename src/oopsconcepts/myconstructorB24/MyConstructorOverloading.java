package oopsconcepts.myconstructorB24;

public class MyConstructorOverloading {
	int i;
	String n;
	
	MyConstructorOverloading(){	
		System.out.println("From Default Constructor");
	}
	MyConstructorOverloading(int i){	
		System.out.println("in int constructor ");
	}
	MyConstructorOverloading(String s){	
		System.out.println("in string constructor ");
	}
	MyConstructorOverloading(int i,String s){
		System.out.println("in int & string constructor ");
	}
	MyConstructorOverloading(String s, int i){	
		System.out.println("in string & int constructor ");
	}
	
}
