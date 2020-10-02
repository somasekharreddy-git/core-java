package com.vidvaan.corejava.array01singlediemension;

public class Example06ReturningArrayFromMethod {
	public static void main(String[] args) {

		int[] values = { 10, 20, 30, 40, 50 };
		int[] result = reverse(values);
		for (int val : result) {
			System.out.println("" + val);
		}

	}

	public static int[] reverse(int[] input) {
		for (int i = 0; i < input.length / 2; i++) {
			int temp = input[i]; // swap numbers
			input[i] = input[input.length - 1 - i];
			input[input.length - 1 - i] = temp;
		}
		return input;
	}
}
