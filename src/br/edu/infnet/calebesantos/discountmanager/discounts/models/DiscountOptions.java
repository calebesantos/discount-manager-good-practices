package br.edu.infnet.calebesantos.discountmanager.discounts.models;

public class DiscountOptions {

	private int accountTimeInYears;
	
	public DiscountOptions(int accountTimeInYears) {
		this.accountTimeInYears = accountTimeInYears;
	}

	public int getAccountTimeInYears() {
		return accountTimeInYears;
	}

	public void setAccountTimeInYears(int accountTimeInYears) {
		this.accountTimeInYears = accountTimeInYears;
	}

}
