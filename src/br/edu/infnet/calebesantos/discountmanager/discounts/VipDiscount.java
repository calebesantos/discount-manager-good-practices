package br.edu.infnet.calebesantos.discountmanager.discounts;

import br.edu.infnet.calebesantos.discountmanager.discounts.interfaces.Discount;

public class VipDiscount implements Discount {
	private final double discount = 0.5;

	@Override
	public double getDiscount() {
		return discount;
	}

}
