package com.vidvaan.corejava.array01singlediemension;

@SuppressWarnings("unused")
public class Example01ArrayCreation {
	public static void main(String[] argv) {
		int days[];
		days = new int[12];
		days[1] = 28;
		System.out.println(days[1]);

		// It is possible to combine the declaration of the array variable with
		// the allocation of the array itself.
		int month_days[] = new int[12];
	}
}