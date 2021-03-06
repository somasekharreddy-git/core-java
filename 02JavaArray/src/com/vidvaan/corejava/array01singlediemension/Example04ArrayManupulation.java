package com.vidvaan.corejava.array01singlediemension;

public class Example04ArrayManupulation {
	public static void main(String[] args) {
		double[] myList = { 1.9, 2.9, 3.4, 3.5 };

		// Print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
		}
		// Summing all elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("Total is " + total);
		// Finding the largest element
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}
		System.out.println("Max is " + max);

		// Finding the smallest element
		double min = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] < min)
				min = myList[i];
		}
		System.out.println("Min is " + min);
	}
}
