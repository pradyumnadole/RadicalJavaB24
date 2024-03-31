package oopsconcepts.Inheritence;

public class B24MyMethodOverloadingTest {

	public static void main(String[] args) {
		B24MyMethodOverloading obj = new B24MyMethodOverloading();
		obj.createuser("Pradyumna");
		obj.createuser(15, "F88");
		obj.createuser("PD", 20);
		obj.createuser("New", 22, "pd@yahoo.com");
		obj.createuser(26);
	}
}
