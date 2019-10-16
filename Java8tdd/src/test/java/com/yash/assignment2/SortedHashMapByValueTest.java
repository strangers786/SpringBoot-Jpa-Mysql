package com.yash.assignment2;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class SortedHashMapByValueTest {

	SortedHashMapByValue sortedHashMapByValue = new SortedHashMapByValue();

	@Test
	public void sortedHashMapByValue() {

		LinkedHashMap<String, Integer> hashmap = new LinkedHashMap<String, Integer>();
		hashmap.put("nikhil", 69);
		hashmap.put("bhashkar", 79);
		hashmap.put("mayank", 59);
		System.out.println("Expected LinkedHash Map" + hashmap);

		Map<String, Integer> sortByValue = sortedHashMapByValue.sortByValue(hashmap);
		System.out.println("assert LinkedHashMap and sortedMap" + sortByValue);
		assertEquals(hashmap, sortByValue);
	}
}
