package Basic;

public class BasicOfMethod {

	public boolean createUser(String name, int empId) {

		System.out.println("user created with name " + name);
		if (name.equals("Pradyumna")) {
			return true;
		}else {
			return false;
		}
		
	}

	public String deleteUser(int empId) {

		System.out.println("user deleted with empId " + empId);
		return "user deleted successfully";
	}

}
