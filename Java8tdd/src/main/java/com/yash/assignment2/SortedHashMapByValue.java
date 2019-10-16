package com.yash.assignment2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author mayank.soni
 * 
 *         You can sort a Map like a HashMap, LinkedHashMap, or TreeMap in Java
 *         8 by using the sorted() method of java.util.stream.Stream class.
 *         These means accepts a Comparator, which can be used for sorting. If
 *         you want to sort by values then you can simply use the
 *         comparingByValue() method of the Map.Entry class. This method is
 *         newly added in Java 8 to make it easier for sorting.
 * 
 *         code -
 *         hashmap.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()).forEach(System.out::println);
 *
 */

public class SortedHashMapByValue {

	public Map<String, Integer> sortByValue(HashMap<String, Integer> hashmap) {
		/**
		 * Collecting into Map
		 * 
		 * // now, let's collect the sorted entries in Map Map<String, Integer>
		 * sortedByPrice = ItemToPrice.entrySet() .stream()
		 * .sorted(Map.Entry.<String, Integer>comparingByValue())
		 * .collect(Collectors.toMap(e -> e.getKey(),e -> e.getValue()));
		 */

		/**
		 * The Map returned by the previous statement was not sorted because
		 * ordering was lost while collecting result in Map you need to use the
		 * LinkedHashMap to preserve the order
		 */

		Map<String, Integer> sortedByValue = hashmap.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("Sorted Map" + sortedByValue);
		return sortedByValue;
	}

}
