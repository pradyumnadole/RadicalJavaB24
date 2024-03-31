package mycollection;

import java.util.ArrayList;



public class MyArrayList {

	public static void main(String[] args) {

		//duplication allowed
		//insertion order maintained
		ArrayList<String> MyArray = new ArrayList<String> ();
		MyArray.add("New");
		MyArray.add("Test");
		MyArray.add("D88");
		MyArray.add(3, "Day");
		
		for (String s1 : MyArray) {
			System.out.println(s1);
		}
		System.out.println("===========");
		
		MyArray.remove(2);
		for (String s1 : MyArray) {
			System.out.println(s1);
		}
		System.out.println("===========");
		
		MyArray.add("New");
		for (String s1 : MyArray) {
			System.out.println(s1);
		}
	}

}
