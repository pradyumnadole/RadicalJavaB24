package Excercise;

import org.testng.annotations.Test;

public class MyPracticeStringOccurance {
	@Test
	public void testcase1() {
		String newstr = "Pradyumna";
		char ch = 'a';
		int cnt = 0;
		
		for (int i =0;i<newstr.length();i++) {
			if(newstr.charAt(i) == ch) {
				cnt++;
			}
			
		}
		 System.out.println("Occurrences of "+ch+" are " +cnt);
	
	}
	
}
