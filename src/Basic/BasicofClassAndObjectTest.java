package Basic;

public class BasicofClassAndObjectTest {

	int i = 200;
	String name = "ABCD";

	public static void main(String[] args) {
		// creating object of other class
	   // create varible of the variable present in other class.
	   // Reusability is the purpose.
		System.out.println("I am in Main method");

		BasicofClassAndObject obj = new BasicofClassAndObject(); 
		int k = obj.i; 
		System.out.println("value from other class " + k);
		
		String name1 = obj.name;
		System.out.println("value from other class " + name1);
		
		BasicofClassAndObject_1 obj1 = new BasicofClassAndObject_1();
		int l = obj1.a;
		System.out.println("value from _1 class " + l);
		
		String name2 = obj1.newname;
		System.out.println("value from _1 class " + name2);

		System.out.println("End of Main method");

	}

}
