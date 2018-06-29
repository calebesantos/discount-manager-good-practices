package br.edu.infnet.calebesantos.discountmanager;

import br.edu.infnet.calebesantos.discountmanager.ioc.DiscountManagerInjector;

public class Main {

	public static void main(String[] args) {
		DiscountManager discountManager = DiscountManagerInjector.getDiscountManager();
		double discount = discountManager.ApplyDiscount(5.0, AccountType.Standard, 5);
		System.out.println(discount);
	}

}
