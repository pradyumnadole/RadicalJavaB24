package Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Prac02172024 {
	static StringBuilder str1 = new StringBuilder();
	
	
	public static void main(String[] args) {
		
		//1.Difference between size & length
		String str = "abc";
		System.out.println (str.length());
		String arr [] = {"a","b"};
		int a = arr.length;
		System.out.println(a);
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("m");
		arr1.add("m");
		arr1.add("m");
		System.out.println(arr1.size());
		
		//2.Find longest word in string array
		String[] animalNames = {"catgoauaaaauut", "rabbit", "horse", "goauaaaauut", "rooster", "p"};
		String maxlethWord = ""; 
		int len = animalNames.length;	
		for (int i =0 ;i<len;i++) {		
			if(animalNames[i].length()> maxlethWord.length()) {
				maxlethWord = animalNames[i]; 
			}		
		}
		System.out.println(maxlethWord); 
		
		//3.Find longest common substring in string array
		String[] interview = {"flow", "flo", "fla"};
		Arrays.sort(interview);
		char [] first = interview[0].toCharArray();
		char [] last = interview[interview.length-1].toCharArray();
		for (int i = 0;i<first.length; i++) {	
			if(first[i]!=last[i]) {
				break;	
			}
			str1.append(first[i]);
		}
		 System.out.println(str1);
		 
		//4.Find digit in string
		 String strnew = "abc123";
		 for (int i =0; i< strnew.length();i++) {
			 if (Character.isDigit(strnew.charAt(i))) {
				  System.out.println(strnew.charAt(i));
			 }
			 
		 }
		 
		//5.Find digit in string & its location
		 String strnew1 = "Pradyumna22009";
		 int digit =0;
		 for (int i =0; i< strnew1.length();i++) {		 
			 if (strnew1.charAt(i)>=48 && strnew1.charAt(i)<=57) {
				 digit++; 
				 System.out.println("**Digit present is "+ strnew1.charAt(i));				 
			 }			 
		 }
		 System.out.println("**Total number of digits are "+ digit);
	
		//6.Find duplicated in int array & its location
		 int [] iarr = {1,1,2,2,23};
		 int len1 = iarr.length;	 
		 for (int i =0; i<len1; i++) {
			 for (int j =i+1;j<len1; j++ ) {	
				if (iarr[i]==iarr[j]) {
					System.out.println(iarr[i]);
				}		 
			 }	 
		 }
		 
		//7.Find duplicated charachters in  array	 
		 String strpd = "Pradyumna dole";
		 int count =0;
		 char [] ch = strpd.toCharArray();
		 for (int i =0; i<strpd.length(); i++) {
			 for (int j =i+1;j<strpd.length(); j++ ) {
				 if (ch[i]==ch[j]) {
					 System.out.println("Duplicated charachter in array: "+ch[i]); 
					 count++;
				 }
			 }	 
		 }
		 System.out.println("Total Duplicated charachter in array: "+count);
		 
		//8.Combination on string
		 
		permutation("Permutation is : ", "ABC");

	}

	private static void permutation(String permutation,String input) {
		int lend= input.length();
		if (input.length() ==0) {
			System.out.println(permutation);
		}
		else {
		for (int i =0; i<lend; i++) {
			permutation (permutation+input.charAt(i),input.substring(0,i)+input.substring(i+1,lend));	
			//recussion code ***very impo to understand & remind
			
		}		
		}

	}

}
