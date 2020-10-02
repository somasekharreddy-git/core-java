package com.vidvaan.corejava.basic011programs;
//**********
//****  ****
//***    ***
//**      **
//*        *
//**      **
//***    ***
//****  ****
//**********

public class Example08StarPatterns {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 6 - i; j++) {
				System.out.printf("*");
			}
			for (k = 1; k < i; k++) {
				System.out.printf("  ");
			}
			for (j = 1; j <= 6 - i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		for (i = 2; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			for (k = 1; k <= 5 - i; k++) {
				System.out.printf("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}