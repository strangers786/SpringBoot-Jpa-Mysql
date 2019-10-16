package com.yash.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountOfcharactersTest {

	CountOfCharacters countOfCharacters = new CountOfCharacters();

	@Test
	public void shouldReturnCountOfCharacter() {

		String countOfCharactersWithString = countOfCharacters.getCountOfCharactersWithString("iamyashemployee");
		assertEquals("ia2m2y2she3plo", countOfCharactersWithString);
	}

}
