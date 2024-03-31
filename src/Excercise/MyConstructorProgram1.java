package Excercise;

public class MyConstructorProgram1 {
	double height;
	double width;
	double depth;
	double volume;
	double volume1;

	MyConstructorProgram1() {
		height = 2.5;
		width = 6.5;
		depth = 7.68;
		volume = height * width * depth;
	}

	MyConstructorProgram1(double height1, double width1, double depth1) {

		volume1 = height1 * width1 * depth1;
	}
}
