package mycollection;

import java.util.Arrays;

public class Prac01262024 {
	
	
	public static void main (String [] args) {
		//if contents are exactly same in array we can arrays.equal
		//but if contents are different we need to write code
		
	int arr1[] = {1, 2, 5, 4, 0}, arr2[] = {2, 4, 5, 0, 1};
	//int arr1[] = {2, 4, 5, 0, 1}, arr2[] = {2, 4, 5, 0, 1};
	String str1[]= {"a","b","w"}, str2[]= {"b","d","a"};
	
	// Function call
    if (areEqual1(str1, str2))
        System.out.println("str Yes");
    else
        System.out.println("str No");
    
	// Function call
    if (areEqual(arr1, arr2))
        System.out.println("int Yes");
    else
        System.out.println("int No");
	
}

	private static boolean areEqual1(String[] str1, String[] str2) {
		int N1 = str1.length;
		int M1 = str2.length;
		
		if(N1!=M1) 
		{
			return false;
		}
		else 
		{
			Arrays.sort(str1);
			Arrays.sort(str2);	
			for (int i = 0; i<N1; i++) 
			{
				if(str1[i]!=str2[i]) 
				{
					return false;
				}
			
			}	
			return true;
		}


	
	}

	private static boolean areEqual(int[] arr1, int[] arr2) {
		
		int N = arr1.length;
		int M = arr2.length;
		
		if(N!=M) {
			return false;
					}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);	
		for(int i = 0; i<N; i++) {
			if (arr1[i]!=arr2[i]) {
				return false;
			}	
			// If all elements were same.
	        return true;
		}
		
		return false;

	}

	
	
}
