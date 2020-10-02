package com.vidvaan.corejava.basic008break;

public class JavaBreakLableExample02 {
	public static void main(String[] args) {

		int[][] arr = {

		{ 2, 10 }, { 3, 5 }, { 11, 7 }

		};

		int row, col = 0;

		first: for (row = 0; row < arr.length; row++) {
			// using break label to terminate outer statements
			second: for (col = 0; col < arr[0].length; col++) {

				if (arr[row][col] > 10) {
					break;
				}

			}

		}
		System.out.println("First int greater than 10 is found at index " + row
				+ " " + col);

	}
}
