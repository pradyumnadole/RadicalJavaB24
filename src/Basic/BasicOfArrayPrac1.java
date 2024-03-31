package Basic;

import java.util.ArrayList;

public class BasicOfArrayPrac1 {

	public static void main(String[] args) {
		
		int[] myStrA = {-1,2,3,-4};
		try {
			System.out.println(myStrA[-1]);//index out of bound error
		} catch (Exception e) {
			System.out.println("In catch");
			//e.printStackTrace();
		}
		
		ArrayList<String> myStrB = new ArrayList<String>();
		myStrB.add("A");
		myStrB.add("B");
		myStrB.add("C");
		System.out.println(myStrB);
		
		
		
	}

}
