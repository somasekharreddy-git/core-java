package com.vidvaan.corejava.array01singlediemension;

public class Example05PassingArrayToMethod {
	public static void main(String[] args) {
		int[] number = { 10, 20, 30, 40, 50 }; // creation array
		int sum = 0;

		sum = findSum(number); // invoke the method
		System.out.println("The sum is    ::  " + sum + ".");
	}

	public static int findSum(int[] value) // method definition to find sum
	{
		int i, total = 0;
		for (i = 0; i < value.length; i++) {
			total = total + value[i];
		}
		return (total);
	}
}
