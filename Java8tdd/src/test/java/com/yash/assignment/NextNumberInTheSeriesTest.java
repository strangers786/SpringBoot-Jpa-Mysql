package com.yash.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.assignment.NextNumberInTheSeries;

public class NextNumberInTheSeriesTest {

	NextNumberInTheSeries nextNumberInTheSeries = new NextNumberInTheSeries();

	/**
	 * 19 is wrong number
	 */
	@Test
	public void shouldReturnNextOddNumberInTheSeries() {
		int[] a = { 7, 10, 8, 11, 9, 12 };

		int actual = nextNumberInTheSeries.nextNumber(a);
		assertEquals(10, actual);
	}

	@Test
	public void shouldReturnNextEvenNumberInTheSeries() {
		int[] a = { 7, 10, 8, 11, 9, 12, 10 };

		int actual = nextNumberInTheSeries.nextNumber(a);
		assertEquals(13, actual);
	}

}
