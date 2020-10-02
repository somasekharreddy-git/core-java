package com.vidvaan.corejava.basic011programs;

//*
//**
//***
//****
//*****
public class Example01StarPattrens {
	public static void main(String[] args) {
		int i, j;
		for (i = 5; i >= 1; i--) {
			for (j = 5; j >= i; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
