package oopsconcepts.Encapsulation;

import org.testng.annotations.Test;

public class B24MyEncapsulationTestCase {

	B24MyEncapsulationUserOperation userCr1 = new B24MyEncapsulationUserOperation();
	
	@Test
	public void testCase1() {
		B24MyEncapsulation obj1 = new B24MyEncapsulation();
		obj1.setSname("Pradyumna");
		obj1.setEmpid(88);
		userCr1.createUser(obj1);
	}
	
	@Test
	public void testCase2() {
		B24MyEncapsulation obj2 = new B24MyEncapsulation();
		obj2.setSname("Test1");
		obj2.setEmpid(8118);
		obj2.setAddress("Pune4");
		userCr1.createUser(obj2);
	}

	@Test
	public void testCase3() {
		B24MyEncapsulation obj3 = new B24MyEncapsulation();
		obj3.setSname("Test2");
		obj3.setEmpid(818);
		obj3.setAddress("Pune3");
		obj3.setMob(1234567890);
		userCr1.createUser(obj3);
	}
	
	@Test
	public void testCase4() {
		B24MyEncapsulation obj4 = new B24MyEncapsulation();
		obj4.setSname("Test3");
		obj4.setEmpid(8180);
		obj4.setAddress("Pune2");
		obj4.setMob(1212121);
		obj4.setEducation("B.E.");
		userCr1.createUser(obj4);
	}
	
	@Test
	public void testCase5() {
		B24MyEncapsulation obj5 = new B24MyEncapsulation();
		obj5.setSname("Test55");
		obj5.setEmpid(8180022);
		obj5.setAddress("Pune18");
		obj5.setMob(1234567);
		obj5.setEducation("B.E.");
		obj5.setHobby("Playing Cricket");
		userCr1.createUser(obj5);
	}
	
}
