package Basic;

public class MyStringOperation {

	public static void main(String[] args) {
//		String a1 = "ab";
//		String b1 = "bc";
//		System.out.println(a1+b1);
//		
//		boolean b = a1.equals(b1);
//		System.out.println("result "+b);
//		
//		System.out.println(a1.toUpperCase());
//		System.out.println(b1.charAt(0));
//		System.out.println(a1.replace("a", "p"));
//		System.out.println(a1.concat(b1));
		String a1 = "ab";
		String b1 = "ab";
		String c1 = new String ("ab");
		System.out.println(a1.equals(b1));
		System.out.println(a1==b1);
		System.out.println(b1.equals(c1));
		System.out.println(b1==c1);
		
		
	}

}
