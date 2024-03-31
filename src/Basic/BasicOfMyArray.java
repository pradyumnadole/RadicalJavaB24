package Basic;

public class BasicOfMyArray {

	public static void main(String[] args) {

		// First way of writing Array - getting individually
		int[] myArray = new int[4];
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		System.out.println("First way of getting Array " + myArray[2]);
		
		System.out.println("=================================");
		
		// Second way of writing Array - for loop
		int len = myArray.length;
		for (int i = 0; i < len; i++) {
			System.out.println("Second way of getting Array " + myArray[i]);
		}
		
		System.out.println("================================");

		// Third way of writing Array - for each loop
		int[] myArray1 = { 100, 200, 300, 400 }; // array declared with values
		for (int i : myArray1) {
			System.out.println("Third way of getting Array " + i);
		}

	}

}
