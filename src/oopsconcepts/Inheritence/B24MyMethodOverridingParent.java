package oopsconcepts.Inheritence;

public class B24MyMethodOverridingParent {
	public void createuser(String name, int userId, String email) {
		System.out.println("Parent: User name is " + name);
		System.out.println("Parent: User id is "+ userId);
		System.out.println("Parent: User email id is "+ email);
		
	}
	
	public void deleteuser(String name) {
		System.out.println("Parent: deleting name is " + name);
	}

	
}
