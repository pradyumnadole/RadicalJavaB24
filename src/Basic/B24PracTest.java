package Basic;

public class B24PracTest {

	public static void main(String[] args) {
		
		B24Prac obj = new B24Prac();
		obj.createUser();
		obj.createUserval("BB", 122);
		boolean return1;
		System.out.println(return1 = obj.createUserval1("AAA", 122));
		
		String [] arr = {"A","D","K","M"};
		int size = arr.length;
		System.out.println(size);
		
		int [] intarr = {11,22,66,88};
		int size1 = intarr.length;
		System.out.println(size1);
		System.out.println(intarr[2]);
		
		for (int i =0;i<intarr.length;i++) {
			System.out.println("value of i "+ intarr[i]);
		}
		
		for (int i : intarr) {
			System.out.println("value1 of i "+ i);
		}
		
		
		
		
		
		
	}

}
