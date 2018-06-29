package br.edu.infnet.calebesantos.discountmanager.unittests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.infnet.calebesantos.discountmanager.AccountType;
import br.edu.infnet.calebesantos.discountmanager.DiscountManager;
import br.edu.infnet.calebesantos.discountmanager.ioc.DiscountManagerInjector;

class DiscountManagerTest {
	DiscountManager discountManager = null;

	@BeforeEach
	void initialize() {
		discountManager = DiscountManagerInjector.getDiscountManager();
	}

	@Test
	void GivenDiscountValuesThenReturnPriceDiscountMoreThanZero() {
		double originalPrice = 5.0;
		double priceWithDiscount = discountManager.ApplyDiscount(originalPrice, AccountType.Standard, 5);
		assertTrue(priceWithDiscount > 0);
	}
	
	@Test
	void GivenDiscountValuesThenReturnPriceDiscountLessOrEqualsThanOriginalPrice() {
		double originalPrice = 5.0;
		double priceWithDiscount = discountManager.ApplyDiscount(originalPrice, AccountType.Standard, 5);
		assertTrue(priceWithDiscount <= originalPrice);
	}

}
