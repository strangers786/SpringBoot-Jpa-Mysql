package com.yash.assignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yash.assignment.SubListFromArrayList;

public class SubListFromArrayListTest {

	SubListFromArrayList subListFromArrayList = new SubListFromArrayList();

	@Test
	public void shouldReturnSubList() {

		List<Object> listInteger = new ArrayList<Object>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(3);
		listInteger.add(4);
		listInteger.add(5);
		List<Object> actual = subListFromArrayList.createSubList(listInteger, 2, 4);

		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(4);

		assertEquals(expected, actual);
	}
}
