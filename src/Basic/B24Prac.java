package Basic;

public class B24Prac {

	int i = 10;
	public void createUser() {
		
		System.out.println("Username is ABC");
	}
	
	public void createUserval(String str, int empid) {
		
		System.out.println("Username is "+ str +" and " + empid);
	}
	
	public boolean createUserval1(String str, int empid) {
		
		System.out.println("Username is "+ str +" and " + empid);
		if(str.equals("BB")) {
			return true;
		}else {
		return true;
		}
	}
	
}
