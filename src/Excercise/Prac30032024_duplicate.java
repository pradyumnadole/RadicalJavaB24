package Excercise;

public class Prac30032024_duplicate {
	public static void main(String[] args) {
		int [] arr = new int []{1,2,2,5,5,6};
		
		for (int i =0;i<arr.length;i++) {
			for (int j =i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}


}
