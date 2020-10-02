package com.vidvaan.corejava.basic011programs;

public class Example17FindBiggestNumber {
	public static void main(String[] args) {
		int n1 = 12, n2 = 78, n3 = 89, big;
		if (n1 > n2) {
			if (n1 > n3)
				big = n1;
			else
				big = n3;
		} else {
			if (n2 > n3)
				big = n2;
			else
				big = n3;
		}
		System.out.println("Biggest No: " + big);
	}
}
