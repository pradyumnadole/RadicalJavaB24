package oopsconcepts.Inheritence;

public class B24MyMethodOverloading {
	//DataType
	//SequenceType
	//number of parameter
	
	public void createuser(String name, int userId) {
		System.out.println("User name is " + name);
		System.out.println("User id is "+ userId);
		
	}
	public void createuser(int userId,String name) {
		System.out.println("User name is " + name);
		System.out.println("User id is "+ userId);
		
	}
	public void createuser( int userId) {
		System.out.println("User id is "+ userId);
		
	}
	public void createuser(String name) {
		System.out.println("User name is " + name);
		
	}
	public void createuser(String name, int userId, String email) {
		System.out.println("User name is " + name);
		System.out.println("User id is "+ userId);
		System.out.println("User email id is "+ email);
		
	}

}
