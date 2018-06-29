package br.edu.infnet.calebesantos.discountmanager.accounts;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.calebesantos.discountmanager.accounts.interfaces.Account;
import br.edu.infnet.calebesantos.discountmanager.discounts.metadata.DiscountType;

public class StandardAccount implements Account {

	@Override
	public List<DiscountType> getDiscounts() {
		List<DiscountType> discounts = new ArrayList<>();
		discounts.add(DiscountType.Standard);
		discounts.add(DiscountType.AccountTimeInYears);

		return discounts;
	}

}
