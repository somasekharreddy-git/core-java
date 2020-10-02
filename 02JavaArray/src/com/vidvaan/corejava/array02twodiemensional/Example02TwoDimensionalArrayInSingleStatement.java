package com.vidvaan.corejava.array02twodiemensional;

public class Example02TwoDimensionalArrayInSingleStatement {
	public static void main(String[] args) {
		String[][] salutation = { { "Mr. ", "Mrs. ", "Ms. " }, { "Narayan" } };

		// Mr. Narayan
		System.out.println(salutation[0][0] + salutation[1][0]);

		// Mrs. Narayan
		System.out.println(salutation[0][1] + salutation[1][0]);
	}
}
