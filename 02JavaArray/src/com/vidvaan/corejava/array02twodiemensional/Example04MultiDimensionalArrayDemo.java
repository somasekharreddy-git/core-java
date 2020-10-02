package com.vidvaan.corejava.array02twodiemensional;

public class Example04MultiDimensionalArrayDemo {
	public static void main(String[] arg) {
		long[][][] beans = new long[5][10][30];

		for (int i = 0; i < beans.length; i++) {
			for (int j = 0; j < beans[i].length; j++) {
				beans[i][j] = new long[(int) (1.0 + 6.0 * Math.random())];

			}

		}

	}
}
