package Excercise;

import java.util.Scanner;

import org.testng.annotations.Test;

public class MyPracticeFtoC {

	@Test
	public void testcase1() {

		 float temperatue;
		    Scanner in = new Scanner(System.in);      
		 
		    System.out.println("Enter temperatue in Fahrenheit");
		    temperatue = in.nextInt();
		 
		    temperatue = ((temperatue - 32)*5)/9;
		 
		    System.out.println("Temperatue in Celsius = " + temperatue);
	
	
	}
	
}
