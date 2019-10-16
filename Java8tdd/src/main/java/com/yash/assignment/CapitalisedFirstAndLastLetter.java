package com.yash.assignment;

public class CapitalisedFirstAndLastLetter {

	public String convertFirstAndLastToCapitalLetter(String inputString) {

		String[] split = inputString.toLowerCase().split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < split.length; i++) {

			String word = split[i];

			sb = sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1, word.length() - 1))
					.append(Character.toUpperCase(word.charAt(word.length() - 1))).append(" ");

		}
		return sb.substring(0, sb.length()-1);

	}

}
