package Excercise;

import org.testng.annotations.Test;

public class Prac01242024 {
	//program to reverse string, palindrome
	
	@Test
	public void testcase1() {
		String newstr = "Test";
		String rev= "";
		
		for (int i=0; i<newstr.length();i++) {
			rev =  newstr.charAt(i)+ rev;
			
		}
		System.out.println(rev);
		///////////////////////////
		String newstr1 = "RADAR";
		String rev1= "";
		for (int i=0;i<newstr1.length();i++) {
			rev1 =  newstr1.charAt(i)+ rev1;
			
		}
		System.out.println(rev1);
		if (rev1.equals(newstr1)){
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		///////////////////////////
		int num= 454;
		int sum = 0,temp, r =0;
		
		temp = num;
		while(num>0) {
			r= num%10;
			sum = (sum*10)+r;	
			num = num/10;
		}
		System.out.println(sum);
		
		if(temp == sum) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	
	}

	

	
		
	
}
