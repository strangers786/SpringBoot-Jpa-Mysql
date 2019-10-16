package com.yash.assignment;

public class WrongNumberInTheSeries {

	public boolean checkWrongNumber(int[] a) {

		boolean wrongNumber = false;
		for (int i = 0; i < a.length; i++) {
			if (i + 2 < a.length && !((a[i] + 5) == a[i + 2])) {
				return wrongNumber;
			}
			i++;
		}

		for (int j = 1; j < a.length; j++) {
			if (j + 2 < a.length && !((a[j] + 10) == a[j + 2])) {
				return wrongNumber;
			}
			j++;
		}
		return wrongNumber;
	}

}
