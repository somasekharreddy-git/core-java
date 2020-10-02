package com.vidvaan.corejava.basic011programs;

//        *
//       ***
//      *****
//     *******
//    *********
//     *******
//      *****
//       ***
//        *
public class Example07StarPatterns {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			for (j = i; j < 5; j++) {
				System.out.printf(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		for (i = 4; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.printf(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
