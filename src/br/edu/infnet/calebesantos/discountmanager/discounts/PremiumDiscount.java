package br.edu.infnet.calebesantos.discountmanager.discounts;

import br.edu.infnet.calebesantos.discountmanager.discounts.interfaces.Discount;

public class PremiumDiscount implements Discount {
	private final double discount = 0.3;

	@Override
	public double getDiscount() {
		return discount;
	}

}
