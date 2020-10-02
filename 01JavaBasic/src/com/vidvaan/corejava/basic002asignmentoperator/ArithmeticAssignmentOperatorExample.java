package com.vidvaan.corejava.basic002asignmentoperator;

/***
 * 
 * Java provides short cut operators to combine an Arithmetic operator and
 * assignment operator. For example,
 * 
 * i = i + 5;
 * 
 * can also be rewritten as
 * 
 * i+= 5;
 * 
 * Java arithmetic assignment operators like +=, -=, *= and /=.
 * 
 * @author Vidvaan
 *
 */
class ArithmeticAssignmentOperatorExample {
	static int a = 10, b = 15, c = 15;
	public static void main(String[] args) {
		
		System.out.println("Assignment and shortcut assignment operators");
		System.out.println(" a value = " + (a = 15));
		System.out.println(" Addition  = " + (a += b));
		System.out.println(" Subtraction  = " + (c -= b));
		System.out.println(" Division = " + (a /= 2));
		System.out.println(" Multiplication = " + (a *= 2));

	}
}