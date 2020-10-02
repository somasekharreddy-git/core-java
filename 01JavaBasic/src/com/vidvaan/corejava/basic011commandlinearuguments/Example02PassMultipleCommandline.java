package com.vidvaan.corejava.basic011commandlinearuguments;

public class Example02PassMultipleCommandline {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
			System.out.println("index :: " + i + "  value :: " + args[i]);
	}
}
