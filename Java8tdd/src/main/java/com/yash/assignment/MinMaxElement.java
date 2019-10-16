package com.yash.assignment;

public class MinMaxElement {

	public int[] getMinMaxElement(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
		return a;
	}

}
