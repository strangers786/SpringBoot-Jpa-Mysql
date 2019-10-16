package com.yash.assignment2.abstractfactory;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		if (loan == null) {
			return null;
		}
		if (loan.equalsIgnoreCase("home loan")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("business loan")) {
			return new BussinessLoan();
		} else if (loan.equalsIgnoreCase("education loan")) {
			return new EducationLoan();
		}
		return null;

	}

}
