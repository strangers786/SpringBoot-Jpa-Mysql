package com.yash.assignment;

public class Vowels {

	public int calculateVowels(String inputString) {

		int count = 0;
		char[] charArray = inputString.toLowerCase().toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u') {

				count++;
			}
		}
		return count;
	}

}
