package Excercise;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class MyStringProgram2 {
	
	@Test
	public void testcase1() {
		String var1 = "Pradyumna";
		String var2 = "Prakash";
		
		int v1 = var1.length();
		int v2 = var2.length();
		int count = 0;
		 // a temp list of ch for which we have already printed the count
        ArrayList<Character> charList = new ArrayList<>();
		for (int i =0;i<v1;i++) {
			
			char a1 = var1.charAt(i);
			
			for(int j =0;j<v2;j++) {
			
				char b1 = var2.charAt(j);
				if(a1!=b1) {
					continue;
				}
				count++;
				System.out.println("char is " + a1);
				
				if(!charList.contains(a1)) {
					
					if(count > 1 && count!= ' ') {
						System.out.println("char is " + a1 + " count " + count);
						charList.add(a1);
					
					}

				}
				 // set counter to zero for next ch
	            count = 0;
				
			}
				
			
		}
		
		
		
	}

}
