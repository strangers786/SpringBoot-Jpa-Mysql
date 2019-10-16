package com.yash.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Leaders {

	public List<Integer> checkTheLeadersSeries(Integer[] a) {
		List<Integer> listOfLeaders = new ArrayList<>();
		listOfLeaders.add(a[a.length - 1]);
		for (int i = a.length - 1; i > 0; i--) {
			if (a[i - 1] > a[i]) {
				listOfLeaders.add(a[i - 1]);
			}
		}

		return listOfLeaders;
	}

}
