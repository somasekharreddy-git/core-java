package com.vidvaan.corejava.basic004incrementORdecrementoperator;

/***
 * Increment and Decrement Operators Example This example shows how to use Java
 * increment operator (++) and decrement (--) operator.
 * 
 * Java increment operator ++ increases its operand's value by one while
 * decrement operator -- decreases its operand's value by one as given below.
 * 
 * @author Vidvaan
 *
 */
class Example01Increment {

	public static void main(String[] args) {
		int i = 3;
		i++;

		// prints 4
		System.out.println(i);
		++i;

		// prints 5
		System.out.println(i);

		// prints 6
		System.out.println(++i);

		// prints 6
		System.out.println(i++);

		// prints 7
		System.out.println(i);
	}
}