package com.yash.assignment2;

public class Anagram {

	public boolean isAnagram(String a, String b) {

		char[] charA = a.toUpperCase().toCharArray();
		java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();
		for (int i = 0; i < charA.length; i++) {
			if (map.containsKey(charA[i])) {
				map.put(charA[i], (map.get(charA[i]) + 1));
			} else {
				map.put(charA[i], 1);
			}

		}

		char[] charB = b.toUpperCase().toCharArray();
		for (int i = 0; i < charA.length; i++) {
			if (map.containsKey(charB[i])) {
				Integer count = map.get(charB[i]);
				if (count == 0) {
					return false;
				} else {
					count--;
					map.put(charB[i], count);
				}
			} else {
				return false;
			}
		}
		return true;

	}

}
