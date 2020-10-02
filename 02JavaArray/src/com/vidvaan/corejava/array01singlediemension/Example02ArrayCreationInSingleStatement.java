package com.vidvaan.corejava.array01singlediemension;

public class Example02ArrayCreationInSingleStatement {
	public static void main(String[] args) {
		// Declaring an array variable, creating an array, and assigning the
		// reference of the array to the variable can be combined in one
		// statement

		int[] arr = { 1, 2, 3, 4, 5 };

		// displaying values using for loop

		for (int i = 0; i < arr.length; i++) {
			System.out
					.println("  index   ::  " + i + "   value   :: " + arr[i]);
		}

	}
}
