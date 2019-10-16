package com.yash.assignment2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramTest {

	Anagram anagram = new Anagram();

	@Test
	public void shouldReturnAnagramString() {

		boolean anagramStrings = anagram.isAnagram("Keep", "Peek");
		assertTrue(anagramStrings);
	}

	@Test
	public void shouldReturnFalseForWrongAnagramString() {

		boolean anagramStrings = anagram.isAnagram("Brother", "Sister");
		assertFalse(anagramStrings);
	}

}
