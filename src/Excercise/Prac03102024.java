package Excercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Prac03102024 {

	public static void main(String[] args) throws IOException {
		
		String [] str = {};
		System.out.println(str.length);
		
		ArrayList<String> str1 = new ArrayList<String>();
		str1.add("aa");
		
	
		FileInputStream fis = null;
		int k = 0;
		
		fis = new FileInputStream("D:\\ABC.txt");
		
		while((k = fis.read() ) != -1) {
			System.out.println((char) k);
		}
		fis.close();
		
	}
	
	
}
