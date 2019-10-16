package com.yash.assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondHighestNumberTest {

	SecondHighestNumber secondHighestNumber = new SecondHighestNumber();

	@Test
	public void shouldReturnSecondHighestNumber() {

		int a[] = { 1, 2, 3, 4, 3, 4, 2, 2, 2, 6, 7 };

		int fetchSecondHighestNumber = secondHighestNumber.fetchSecondHighestNumber(a);
		assertEquals(6, fetchSecondHighestNumber);

	}

}
