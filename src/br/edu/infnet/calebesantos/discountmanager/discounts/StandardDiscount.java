package br.edu.infnet.calebesantos.discountmanager.discounts;

import br.edu.infnet.calebesantos.discountmanager.discounts.interfaces.Discount;

public class StandardDiscount implements Discount {
	private final double discount = 0.1;

	@Override
	public double getDiscount() {
		return discount;
	}

}
