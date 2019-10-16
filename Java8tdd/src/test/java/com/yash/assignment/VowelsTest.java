package com.yash.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.assignment.Vowels;

public class VowelsTest {

	Vowels vowels = new Vowels();

	@Test
	public void shouldReturnNumberOfVowels() {

		int actual = vowels.calculateVowels("includehelpUi");
		assertEquals(6, actual);

	}

}
