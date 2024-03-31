package oopsconcepts.Encapsulation;

import org.testng.annotations.Test;

public class MyEncapsulationTest {
	
	MyEncapsulationPractiseOperation stdInfo = new MyEncapsulationPractiseOperation();
	
	@Test
	public void testCase1() {
		MyEncapsulationPractise obj= new MyEncapsulationPractise();
		obj.setStdname("Rahul");
		stdInfo.studentData(obj);
	}
	
	@Test
	public void testCase2() {
		MyEncapsulationPractise obj1= new MyEncapsulationPractise();
		obj1.setStdname("Ram");
		obj1.setStdrollno(22);
		stdInfo.studentData(obj1);
	}
	
	@Test
	public void testCase3() {
		MyEncapsulationPractise obj2= new MyEncapsulationPractise();
		obj2.setStdname("Rohan");
		obj2.setStdrollno(25);
		obj2.setStdbusno(2);
		stdInfo.studentData(obj2);
	}

}
