package com.yash.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.assignment.MinMaxElement;

public class MinMaxElementTest {

	MinMaxElement minMaxElement = new MinMaxElement();

	@Test
	public void shouldReturnMinMaxElement() {

		int a[] = { 1, 2, 3, 4, 9, 5, 7 };

		int[] minMaxElementArray = minMaxElement.getMinMaxElement(a);
		assertEquals(1, minMaxElementArray[0]);
		assertEquals(9, minMaxElementArray[minMaxElementArray.length - 1]);
	}

}
