package br.edu.infnet.calebesantos.discountmanager.accounts.factories;

import br.edu.infnet.calebesantos.discountmanager.AccountType;
import br.edu.infnet.calebesantos.discountmanager.accounts.PremiumAccount;
import br.edu.infnet.calebesantos.discountmanager.accounts.StandardAccount;
import br.edu.infnet.calebesantos.discountmanager.accounts.VipAccount;
import br.edu.infnet.calebesantos.discountmanager.accounts.VisitorAccount;
import br.edu.infnet.calebesantos.discountmanager.accounts.interfaces.Account;

public class AccountFactory {

	public Account getAccountByType(AccountType accountType) {
		switch (accountType) {
		case Visitor:
			return new VisitorAccount();
		case Standard:
			return new StandardAccount();
		case Premium:
			return new PremiumAccount();
		case Vip:
			return new VipAccount();
		default:
			throw new IllegalArgumentException("Tipo de conta inválida.");
		}
	}

}
