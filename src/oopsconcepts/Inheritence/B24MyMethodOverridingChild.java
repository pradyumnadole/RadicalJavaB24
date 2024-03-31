package oopsconcepts.Inheritence;

public class B24MyMethodOverridingChild extends B24MyMethodOverridingParent {
	
	public void createuser(String name, int userId, String email) {
		System.out.println("Child: User name is " + name);
		System.out.println("Child: User id is "+ userId);
		System.out.println("Child: User email id is "+ email);
		
	}
	
	public void deleteuser(String name) {
		System.out.println("Child: deleting name is " + name);
	}
	
}
