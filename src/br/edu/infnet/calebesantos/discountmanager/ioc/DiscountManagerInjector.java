package br.edu.infnet.calebesantos.discountmanager.ioc;

import br.edu.infnet.calebesantos.discountmanager.DiscountManager;
import br.edu.infnet.calebesantos.discountmanager.accounts.factories.AccountFactory;
import br.edu.infnet.calebesantos.discountmanager.discounts.factories.DiscountFactory;

public class DiscountManagerInjector {
	private static DiscountFactory _discountFactory;
	private static DiscountManager _discountManager;
	private static AccountFactory _accountFactory;

	public static DiscountFactory getDiscountFactory() {
		if (_discountFactory == null) {
			_discountFactory = new DiscountFactory();
		}
		return _discountFactory;
	}

	public static DiscountManager getDiscountManager() {
		if (_discountManager == null) {
			DiscountFactory discountFactory = getDiscountFactory();
			AccountFactory accountFactory = getAccountFactory();
			_discountManager = new DiscountManager(discountFactory, accountFactory);
		}
		return _discountManager;
	}

	private static AccountFactory getAccountFactory() {
		if (_accountFactory == null) {
			_accountFactory = new AccountFactory();
		}
		return _accountFactory;
	}
}
