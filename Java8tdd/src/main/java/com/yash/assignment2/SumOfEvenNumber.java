package com.yash.assignment2;

import java.util.Arrays;

public class SumOfEvenNumber {

	public int getSumOfEvenNumberFromArray(int[] a) {

		int sum = Arrays.stream(a).filter(x -> x % 2 == 0).sum();
		return sum;

	}

}
