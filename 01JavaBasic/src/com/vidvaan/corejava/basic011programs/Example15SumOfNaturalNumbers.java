package com.vidvaan.corejava.basic011programs;

public class Example15SumOfNaturalNumbers {
	public static void main(String[] args) {
		int n, sum = 0;
		for (n = 1; n <= 10; n++) {
			sum += n; // or sum=sum+n;
		}
		System.out.println("Sum Of NaturalNumbers" + sum);
	}
}
