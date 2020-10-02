package com.vidvaan.corejava.basic001arithmeticoperator;

/***
 * Operator in java is a symbol that is used to perform operations
 * 
 * @author Vidvaan
 *
 */
public class ArithmeticOperatorsExample {
	public static void main(String[] args) {

		// a few numbers
		int i = 10;
		int j = 2;
		double x = 10.5;
		double y = 20.5;

		// Addition - Adds values on either side of the operator
		System.out.println("Adding");
		System.out.println(" i + j = " + (i + j));
		System.out.println(" x + y = " + (x + y));

		// Subtraction - Subtracts right hand operand from left hand operand
		System.out.println("Subtracting");
		System.out.println(" i - j = " + (i - j));
		System.out.println(" x - y = " + (x - y));

		// Multiplication - Multiplies values on either side of the operator
		System.out.println("Multiplying");
		System.out.println(" i * j = " + (i * j));
		System.out.println(" x * y = " + (x * y));

		// Division - Divides left hand operand by right hand operand
		System.out.println("Dividing");
		System.out.println(" i / j = " + (i / j));
		System.out.println(" x / y = " + (x / y));

		// Modulus - Divides left hand operand by right hand operand and returns
		// remainder
		System.out.println("Modulus");
		System.out.println(" i % j = " + (i % j));
		System.out.println(" x % y = " + (x % y));

	}
}