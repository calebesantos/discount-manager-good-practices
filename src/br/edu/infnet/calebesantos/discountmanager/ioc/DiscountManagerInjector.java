package br.edu.infnet.calebesantos.discountmanager.ioc;

import br.edu.infnet.calebesantos.discountmanager.DiscountManager;
import br.edu.infnet.calebesantos.discountmanager.discounts.factories.DiscountFactory;

public class DiscountManagerInjector {
	private static DiscountFactory _discountFactory;
	private static DiscountManager _discountManager;

	public static DiscountFactory getDiscountFactory() {
		if (_discountFactory == null) {
			_discountFactory = new DiscountFactory();
		}
		return _discountFactory;
	}

	public static DiscountManager getDiscountManager() {
		if (_discountManager == null) {
			DiscountFactory discountFactory = getDiscountFactory();
			_discountManager = new DiscountManager(discountFactory);
		}
		return _discountManager;
	}
}
