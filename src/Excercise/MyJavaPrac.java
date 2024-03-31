package Excercise;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class MyJavaPrac {
	
	
	
	@Test
	public void testcase1() {
		String var = "FName=Isaac#LName=Newton#Address=UK";
		
		HashMap<String, String> mymap = new HashMap<String, String>();
		
		String [] arr = var.split("#");
		int s = arr.length;
		
		
		for(int i=0; i<s; i++) {
			String newarr1 [] = arr[i].split("=");
			mymap.put(newarr1[0],newarr1[1]);
		
		}
		for (Entry<String, String> entry : mymap.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key + " : " + val);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
