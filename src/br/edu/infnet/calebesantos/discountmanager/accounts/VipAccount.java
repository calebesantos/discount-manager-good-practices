package br.edu.infnet.calebesantos.discountmanager.accounts;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.calebesantos.discountmanager.accounts.interfaces.Account;
import br.edu.infnet.calebesantos.discountmanager.discounts.metadata.DiscountType;

public class VipAccount implements Account {

	@Override
	public List<DiscountType> getDiscounts() {
		List<DiscountType> discounts = new ArrayList<>();
		discounts.add(DiscountType.Vip);
		discounts.add(DiscountType.AccountTimeInYears);

		return discounts;
	}

}
