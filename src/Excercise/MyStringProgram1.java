package Excercise;

public class MyStringProgram1 {

	public static void main(String[] args) {
		String abc = "boo:and:foo";
		System.out.println(abc.contains("P"));
		System.out.println("================");
		String retval2[]=abc.split("o", 2);
		for (String s1 : retval2) {
			System.out.println("values = "+s1);
		}
		System.out.println("================");
		String retval1[]=abc.split(":");
		for ( String s : retval1) {
			System.out.println("values = "+s);
		}
		System.out.println("================");
		String abc1 = "  boo:and:foo  ";
		System.out.println(abc1.trim());
		System.out.println("================");
		System.out.println(abc.replace("o", "p"));
		System.out.println("================");
		System.out.println(abc.indexOf("a"));
		System.out.println("================");
		char[] ch = abc.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}

}
