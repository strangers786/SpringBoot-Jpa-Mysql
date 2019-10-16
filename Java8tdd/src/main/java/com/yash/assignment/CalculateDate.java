package com.yash.assignment;

import java.time.LocalDate;

public class CalculateDate {

	public LocalDate getDate(long days) {

		LocalDate today = LocalDate.now();
		return today.plusDays(days);
	}

}
