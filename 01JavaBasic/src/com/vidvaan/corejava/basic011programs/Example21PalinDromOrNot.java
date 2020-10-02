package com.vidvaan.corejava.basic011programs;

public class Example21PalinDromOrNot {
	public static void main(String[] args) {
		int n = 82, reverse = 0, temp;
		temp = n;
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			temp = reverse;
			n = n / 10;
		}
		if (temp == reverse)
			System.out.println(reverse);
	}
}
