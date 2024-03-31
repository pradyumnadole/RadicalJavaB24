package mycollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class MyCollectionPractice {
	
	@Test
	public void testcase() {
		
		ArrayList<String> mystr = new ArrayList<String>();
		mystr.add("33");
		mystr.add("PD");
		mystr.add("PD1");
		mystr.add("87");
		
		for (String string : mystr) {	
			if (string.contains("P")) {
				System.out.println(string);
			}
			else {
				System.out.println("Array without P");
			}	
		}
		mystr.remove(3);
		
		for (String string : mystr) {
			System.out.println(string);	
		}
		
		
		TreeSet<String> mytree = new TreeSet<String>();
		mytree.add("C");
		mytree.add("A");
		mytree.add("B");
		mytree.add("A");
	
		for (String string1 : mytree) {
			System.out.println(string1);	
		}
		System.out.println(mytree.size());
		
		mytree.clear();
		
		mytree.add("CD");
		mytree.add("ABCD");
		mytree.add("WER");
		
		for (String string2 : mytree) {
			System.out.println(string2);	
		}
	
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Roll Number", 10);
		map1.put("Bus Number", 20);
		map1.put("AID Number", 30);
		map1.put("Seat Number", 40);
		map1.put("Seat Number", 45);
		
		System.out.println(map1.size());
		
		for (Map.Entry<String, Integer> entry : map1.entrySet()) {
			System.out.println(entry.getKey () + " "+ entry.getValue());
			
		}
		
		Set<String> myarray = new TreeSet<String>();
		
		myarray.add("AB");
		myarray.add("KK");
		myarray.add("DE");
		
		for (String string : myarray) {
			System.out.println(string);
		}
	
	}

}
