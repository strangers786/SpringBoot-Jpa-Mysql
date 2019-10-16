package com.yash.assignment;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.yash.assignment.WrongNumberInTheSeries;

public class WrongNumberInTheSeriesTest {

	WrongNumberInTheSeries wrongNumberInTheSeries = new WrongNumberInTheSeries();

	/**
	 * 19 is wrong number
	 */
	@Test
	public void shouldReturnWronNumberInTheSeries() {
		int[] a = { 3, 12, 8, 19, 13, 32, 18, 42, 23, 52 };

		boolean checkWrongNumber = wrongNumberInTheSeries.checkWrongNumber(a);
		assertFalse(checkWrongNumber);
	}

	/**
	 * 11 is wrong number
	 */
	@Test
	public void shouldReturnWrongNumberInTheSeries() {
		int[] a = { 3, 12, 8, 22, 11, 32, 18, 42, 23, 52 };

		boolean checkWrongNumber = wrongNumberInTheSeries.checkWrongNumber(a);
		assertFalse(checkWrongNumber);
	}

}
