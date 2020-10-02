package com.vidvaan.corejava.basic011programs;

/***
 * Armstrong number is a number which is equal to sum of digits raise to the
 * power total number of digits in the number. Some Armstrong numbers are: 0, 1,
 * 4, 5, 9, 153, 371, 407, 8208 etc.
 * 
 * @author Vidvaan
 *
 */
public class Example20AramStrongNumberOrNot {
	public static void main(String[] args) {
		int n = 153, sum = 0, temp, num;
		temp = n;
		while (temp != 0) {
			num = temp % 10;
			sum = sum + (num * num * num);
			temp = temp / 10;
		}

		if (n == sum)
			System.out.println(n + " is an Armstrong number.");
		else
			System.out.println(n + " is not an Armstrong number.");
	}
}
