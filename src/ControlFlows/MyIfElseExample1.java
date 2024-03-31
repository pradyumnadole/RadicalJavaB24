package ControlFlows;

public class MyIfElseExample1 {

	public static void main(String[] args) {
		int i = 9;
		if (i == 7) {
			System.out.println("Interest Rate is of ICICI " + i);
		} else if (i == 8) {
			System.out.println("Interest Rate is of SBI " + i);
		} else if (i == 9) {
			System.out.println("Interest Rate is of HDFC " + i);
		} else if (i == 10) {
			System.out.println("Interest Rate is of Axis " + i);
		}else {
			System.out.println("Different Interest Rate " + i);
		}

	}

}
