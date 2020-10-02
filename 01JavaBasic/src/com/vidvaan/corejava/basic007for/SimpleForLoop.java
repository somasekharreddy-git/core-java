package com.vidvaan.corejava.basic007for;

public class SimpleForLoop {

	public static void main(String a[]) {
		// simple for loop to print from 1 to 10
		/**
		 * here int i=1; means at the beginning of the loop, we are creating and
		 * initializing the variable to value 1.
		 *
		 * 1<=10; means when i value reaches or above 10, the control should
		 * come out of the loop.
		 *
		 * i++ means on each iteration, we are incrementing i value by step 1.
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		/**
		 * another example to increment by 2 steps
		 */
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		/**
		 * Below loop prints the numbers in reverse order
		 */
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
