package com.vidvaan.corejava.basic011programs;

public class Example18SumOfDigits {
	public static void main(String[] args) {
		int n = 123, res, sum = 0;
		while (n > 0) {
			res = n % 10;
			n = n / 10;
			sum += res; // sum=sum+res;
		}
		System.out.println("Sum Of Digits " + sum);
	}
}
