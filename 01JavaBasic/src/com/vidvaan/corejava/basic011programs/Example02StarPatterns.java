package com.vidvaan.corejava.basic011programs;

//*****
//****
//***
//**
//*

public class Example02StarPatterns {
	public static void main(String[] args) {
		int i, j;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
