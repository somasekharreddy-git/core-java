package com.vidvaan.corejava.basic011programs;

public class Example14FibonacciSeries {
	public static void main(String[] args) {
		int prev, next, sum, n;
		prev = next = 1;
		System.out.print(0 + " ");
		for (n = 1; n <= 10; n++) {
			System.out.print(prev + " ");
			sum = prev + next;
			prev = next;
			next = sum;
		}
	}
}
