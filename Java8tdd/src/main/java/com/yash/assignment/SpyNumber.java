package com.yash.assignment;

public class SpyNumber {

	public boolean checkSpyNumber(int i) {

		String valueOf = String.valueOf(i);
		String[] split = valueOf.split("");
		int count = 0;
		int multiply = 1;
		for (int j = 0; j < split.length; j++) {
			count = count + Integer.parseInt(split[j]);
			multiply = multiply * Integer.parseInt(split[j]);
		}
		if (count == multiply) {
			return true;
		}
		return false;

	}

}
