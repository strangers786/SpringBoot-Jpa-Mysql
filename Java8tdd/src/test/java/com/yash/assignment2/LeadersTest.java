package com.yash.assignment2;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class LeadersTest {

	Leaders leaders = new Leaders();

	@Test
	public void shouldReturnLeaders() {

		Integer a[] = { 1, 2, 3, 5, 7, 4, 6 };

		List<Integer> checkTheLeadersSeries = leaders.checkTheLeadersSeries(a);
		assertEquals(new Integer(6), checkTheLeadersSeries.get(0));
		assertEquals(new Integer(7), checkTheLeadersSeries.get(1));

	}

}
