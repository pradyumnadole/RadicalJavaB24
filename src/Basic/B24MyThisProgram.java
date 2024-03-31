package Basic;

public class B24MyThisProgram {

	private String strNew;

	public void method1(String strNew) {
		
		this.strNew = strNew;
		//strNew = strNew;
		//if same variables are used then this will give output as null
		//but we use this.strNew then it will solve issue by creating instance variable for current
		//class
		System.out.println("Method for this keyword " + this.strNew);
	}
}
