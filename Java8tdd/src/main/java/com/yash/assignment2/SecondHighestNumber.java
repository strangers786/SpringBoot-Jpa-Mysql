package com.yash.assignment2;

import java.util.SortedSet;
import java.util.TreeSet;

public class SecondHighestNumber {

	public int fetchSecondHighestNumber(int[] a) {

		SortedSet<Integer> sortedSet = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			sortedSet.add(a[i]);
		}
		sortedSet.remove(sortedSet.last());
		return sortedSet.last();

	}

}
