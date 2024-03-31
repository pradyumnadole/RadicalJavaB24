package mycollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class myMapClass {
	
	public static void main(String[] args) {

		
		//duplication allowed but overrided
		//insertion order not maintained
		
		Map<Integer, String> mymap = new HashMap<Integer, String> ();
		mymap.put(11, "Delhi");
		mymap.put(22, "Mumbai");
		mymap.put(33, "Chennai");
		mymap.put(44, "Kolkata");
		mymap.put(20, "Hyderabad");
		mymap.put(21, "Pune");
		mymap.put(21, "Pune1");
		//in case of duplicate K-V it gets overrided
		
		int siz = mymap.size();
		System.out.println("size of map is " + siz);
		
		System.out.println("Value of map is " + mymap.get(21));
		
		for (Entry<Integer, String> itempair : mymap.entrySet()) {
			
			System.out.println(itempair.getKey() + " " + itempair.getValue());
		}
		
	}

}
