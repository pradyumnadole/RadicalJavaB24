package Basic;

public class MyStaticVariable {

	//remove static word to check the result and variable value output
	static int i = 0;
	
	MyStaticVariable(){
		i++;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		MyStaticVariable obj1 = new MyStaticVariable();
		MyStaticVariable obj2 = new MyStaticVariable();
		MyStaticVariable obj3 = new MyStaticVariable();
	}

}
