package Basic;

public class B24MyThisProgramTest {


	
	public static void main(String[] args) {
		B24MyThisProgram obj = new B24MyThisProgram();
		obj.method1("ABCD");
		//if same variables are used then this will give output as null
		//but we use this.strNew then it will solve issue by creating instance variable for current
		//class
		
	}

}
