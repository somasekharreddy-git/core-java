package com.vidvaan.corejava.basic011programs;

//*****
// ****
//  ***
//   **
//    *
public class Example04StarPatterns {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.printf(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
