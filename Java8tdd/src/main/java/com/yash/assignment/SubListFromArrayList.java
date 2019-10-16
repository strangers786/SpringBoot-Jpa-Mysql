package com.yash.assignment;

import java.util.List;

public class SubListFromArrayList {

	public List<Object> createSubList(List<Object> list, int firstIndex, int secondIndex) {

		List<Object> subList = list.subList(firstIndex, secondIndex);
		return subList;

	}

}
