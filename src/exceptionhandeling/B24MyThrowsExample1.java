package exceptionhandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class B24MyThrowsExample1 {

	//we can create method before main & add multiple exceptions
	public void method1 () throws IOException,FileNotFoundException {
		FileInputStream file1 = new FileInputStream("C://ABC//PD.xlsx");
		//throw new IOException("Error observed");
	}
	
	public static void main(String[] args) {
		B24MyThrowsExample1 obj = new B24MyThrowsExample1();
		
		try {
			obj.method1();
		} catch (IOException e) {
			System.out.println("in catch");
			e.printStackTrace();
		}
		System.out.println("Regular code");

	}

}
