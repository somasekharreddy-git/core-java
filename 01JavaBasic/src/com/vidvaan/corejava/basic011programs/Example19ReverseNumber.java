package com.vidvaan.corejava.basic011programs;

public class Example19ReverseNumber {
	public static void main(String[] args) {
		int n = 896, reverse = 0;

		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}

		System.out.println("Reverse of entered number is " + reverse);
	}
}
