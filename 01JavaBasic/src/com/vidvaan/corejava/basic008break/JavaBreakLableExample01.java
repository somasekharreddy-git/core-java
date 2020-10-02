package com.vidvaan.corejava.basic008break;

public class JavaBreakLableExample01 {
	public static void main(String[] args) {

		// Java break statement with label example.
		// This example shows how to use java break statement to terminate the
		// labeled loop.
		first: for (int i = 0; i < 10; i++) {
			second: for (int j = 0; j < 5; j++) {
				System.out.println("*");
				break second;
			}
		}

		third: for (int a = 0; a < 10; a++) {
System.out.println("1");
		}
	}
}
