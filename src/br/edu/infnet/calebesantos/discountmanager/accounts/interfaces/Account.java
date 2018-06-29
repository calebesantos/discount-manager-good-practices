package br.edu.infnet.calebesantos.discountmanager.accounts.interfaces;

import java.util.List;

import br.edu.infnet.calebesantos.discountmanager.discounts.metadata.DiscountType;

public interface Account {
	List<DiscountType> getDiscounts();
}
