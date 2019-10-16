package com.yash.assignment;

public class NextNumberInTheSeries {

	public int nextNumber(int[] a) {
		int first = a[0];
		int second = a[1];
		for (int i = 1; i < a.length; i++) {
			if (i % 2 == 0) {
				first = first + 1;
			}
			if (!(i % 2 == 0)) {
				second = second + 1;
			}

		}

		if (a.length % 2 == 0) {
			return first + 1;
		} else {
			return second;
		}

	}

}
