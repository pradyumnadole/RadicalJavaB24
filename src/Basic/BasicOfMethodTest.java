package Basic;

public class BasicOfMethodTest {

	public static void main(String[] args) {
		
		BasicOfMethod obj = new BasicOfMethod();
//		obj.createUser("Pradyumna",900);
//		obj.deleteUser(900);
//		
//		obj.createUser("TestUser",901);
//		obj.deleteUser(901);
//		
//		obj.createUser("TestUser1",902);
//		obj.deleteUser(902);
		
		boolean result = obj.createUser("Pradyumna", 987);
		String result1= obj.deleteUser(987);
		
		System.out.println("Result for user creation = " + result);
		System.out.println("Result for user deletion = " + result1);
		
	}

}
