package Excercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class MyAssignment {
	
	@Test
	public void testcase1() {
		
//		String var = "City=London#FullName=Isaac#LName=Newton#Address=UK#Age=1#School=Trinity#Invention=LawsOfMotion";
//		
//		String[] allValue =   var.split("#");
//		HashMap<String, String> myMap = new HashMap<String, String>();
//		
//		for(int i=0;i<allValue.length;i++) {
//			String[] onePair =   allValue[i].split("=");
//			myMap.put(onePair[0], onePair[1]);
//		}
//		
//		for (Map.Entry<String, String> entry : myMap.entrySet()) {
//			String key = entry.getKey();
//			String val = entry.getValue();
//			System.out.println(key +" : "+val);
//		}
		
		//============
		
		String var = "FName=Isaac#LName=Newton#Address=UK";
		HashMap<String, String> mymap = new HashMap<String, String> ();
		var.length();
		
		String [] arr = var.split("#");
		
		for (int i =0;i< arr.length;i++) {
			
			String [] newarr = arr[i].split("=");
			
			mymap.put(newarr[0], newarr[1]);
			
		}
		for (Entry<String, String> entry : mymap.entrySet()) {
				String key = entry.getKey();
				String val = entry.getValue();
				
				System.out.println(key + " : " + val);
		}
	
	}
}
