package accessspecifiersB24.C;

import accessspecifiersB24.A.MyClassA;

public class MyClassATest {

	public static void main(String[] args) {
		 MyClassA A1 = new MyClassA();
		 accessspecifiersB24.B.MyClassA B1 = new accessspecifiersB24.B.MyClassA ();
		//in case of same class name it is possible to access with fully qualified path
		System.out.println("Value from AccessSpecifier A "+ A1.i);
		System.out.println("Value from AccessSpecifier B "+ B1.i);
		
	}

}
