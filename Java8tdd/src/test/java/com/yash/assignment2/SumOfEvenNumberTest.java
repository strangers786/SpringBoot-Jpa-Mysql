package com.yash.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfEvenNumberTest {

	SumOfEvenNumber sumOfEvenNumber = new SumOfEvenNumber();

	@Test
	public void shouldReturnSumOfEvenNumber() {

		int a[] = { 12, 3, 45, 65, 8, 9, 10, 4, 6 };

		int sumOfEvenNumberFromArray = sumOfEvenNumber.getSumOfEvenNumberFromArray(a);
		assertEquals(40, sumOfEvenNumberFromArray);

	}

}
