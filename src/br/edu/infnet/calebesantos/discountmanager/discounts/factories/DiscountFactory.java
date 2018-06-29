package br.edu.infnet.calebesantos.discountmanager.discounts.factories;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.calebesantos.discountmanager.discounts.AccountTimeInYearsDiscount;
import br.edu.infnet.calebesantos.discountmanager.discounts.PremiumDiscount;
import br.edu.infnet.calebesantos.discountmanager.discounts.StandardDiscount;
import br.edu.infnet.calebesantos.discountmanager.discounts.VipDiscount;
import br.edu.infnet.calebesantos.discountmanager.discounts.VisitorDiscount;
import br.edu.infnet.calebesantos.discountmanager.discounts.interfaces.Discount;
import br.edu.infnet.calebesantos.discountmanager.discounts.metadata.DiscountType;
import br.edu.infnet.calebesantos.discountmanager.discounts.models.DiscountOptions;

public class DiscountFactory {

	public List<Discount> getDiscountsByDiscountTypeList(List<DiscountType> accountDiscounts,
			DiscountOptions discountOptions) {
		List<Discount> discounts = new ArrayList<>();
		for (DiscountType discountType : accountDiscounts) {
			discounts.add(getDiscount(discountType, discountOptions));
		}
		return discounts;
	}

	public Discount getDiscount(DiscountType discountType, DiscountOptions discountOptions) {
		switch (discountType) {
		case Visitor:
			return new VisitorDiscount();
		case Standard:
			return new StandardDiscount();
		case Premium:
			return new PremiumDiscount();
		case Vip:
			return new VipDiscount();
		case AccountTimeInYears:
			return new AccountTimeInYearsDiscount(discountOptions.getAccountTimeInYears());
		default:
			throw new IllegalArgumentException("Tipo de conta inválida.");
		}
	}
}
