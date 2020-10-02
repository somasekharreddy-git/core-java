package com.vidvaan.corejava.basic011programs;

public class Example16FactorialNumber {
	public static void main(String[] args) {
		int n = 5, i, prod = 1;
		for (i = n; i >= 1; i--) {
			prod *= i; // prod=prod*i;
		}
		System.out.println("Factorial of " + n + " is  " + prod);
	}
}
