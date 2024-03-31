package oopsconcepts.Interfaces;

public class MyInterface1and2Class implements MyInterface2 {

	//class implements interfaces
	public void method3() {
		System.out.println("in method 3");
	}

	@Override
	public void method1() {
		System.out.println("in method 1");
		
	}

	@Override
	public void method2() {
		System.out.println("in method 2");
		
	}
}
