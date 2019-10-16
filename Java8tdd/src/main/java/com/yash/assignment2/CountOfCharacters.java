package com.yash.assignment2;

import java.util.LinkedHashMap;

public class CountOfCharacters {

	public String getCountOfCharactersWithString(String inputString) {
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();

		StringBuffer appender = new StringBuffer();
		char[] charArray = inputString.toCharArray();
		for (int i = 0; i < charArray.length; i++) {

			if (hashMap.containsKey(charArray[i])) {
				hashMap.put(charArray[i], hashMap.get(charArray[i]) + 1);
			} else {
				hashMap.put(charArray[i], 1);
			}
		}

		for (Character key : hashMap.keySet()) {

			if (hashMap.get(key) == 1) {
				appender.append(key);
			} else {
				appender.append(key).append(hashMap.get(key));
			}

		}

		return appender.substring(0, appender.length());

	}

}
