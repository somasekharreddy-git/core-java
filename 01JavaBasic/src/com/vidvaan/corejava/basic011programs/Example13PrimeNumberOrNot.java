package com.vidvaan.corejava.basic011programs;

public class Example13PrimeNumberOrNot {
	public static void main(String[] args) {
		int n = 7, i, res;
		boolean flag = true;
		for (i = 2; i <= n / 2; i++) {
			res = n % i;
			if (res == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is not Prime Number");
	}
}
