package oopsconcepts.myconstructorB24;

public class MyConstructorPractise {
	
	int stdrollno;
	String stdname;
	boolean presenty;
	
	MyConstructorPractise (int i,String a){
		stdrollno= i;
	 stdname = 	a;
		System.out.println("roll no is " + i );
		System.out.println("student name is " + a);
	}
	
	MyConstructorPractise (int i,String a,boolean t){
		stdrollno= i;
		stdname = 	a;
		presenty =t; 
		System.out.println("roll no is " + i );
		System.out.println("student name is " + a);
		System.out.println("student status is " + t);
	}

}
