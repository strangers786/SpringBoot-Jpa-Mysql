package com.yash.assignment2.abstractfactory;

public class HomeLoan extends Loan {

	@Override
	public void getInterestRate(double r) {
		rate = r;
	}

}
