package com.yash.assignment;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.time.LocalDate;

import org.junit.Test;

import com.yash.assignment.CalculateDate;

public class CalculateDateTest {


	CalculateDate calculate = new CalculateDate();

	@Test
	public void shouldCalculateDate() throws ParseException {

		LocalDate date = calculate.getDate(10);
		
		assertEquals(21, date.getDayOfMonth());
		assertEquals(10, date.getMonthValue());
		assertEquals(2019, date.getYear());
	}

}
