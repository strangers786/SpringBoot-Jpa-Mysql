package com.yash.assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.yash.assignment.SpyNumber;

public class SpyNumberTest {

	SpyNumber spyNumber = new SpyNumber();

	@Test
	public void spyNumberTest() {

		boolean checkSpyNumber = spyNumber.checkSpyNumber(1124);
		assertEquals(true, checkSpyNumber);

	}

	@Test
	public void notSpyNumberTest() {

		boolean checkSpyNumber = spyNumber.checkSpyNumber(1125);
		assertFalse(checkSpyNumber);

	}

}
