package com.yash.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.assignment.CapitalisedFirstAndLastLetter;

public class CapitalisedFirstAndLastLetterTest {

	CapitalisedFirstAndLastLetter capitalisedFirstAndLastLetter = new CapitalisedFirstAndLastLetter();

	@Test
	public void shouldMakeFirstAndLastCapitalLetter() {
		String convertFirstAndLastToCapitalLetter = capitalisedFirstAndLastLetter
				.convertFirstAndLastToCapitalLetter("yash pune office");
		assertEquals("YasH PunE OfficE", convertFirstAndLastToCapitalLetter);
	}

}
