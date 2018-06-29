package br.edu.infnet.calebesantos.discountmanager.discounts.factories;

import br.edu.infnet.calebesantos.discountmanager.AccountType;
import br.edu.infnet.calebesantos.discountmanager.discounts.AccountTimeInYearsDiscount;
import br.edu.infnet.calebesantos.discountmanager.discounts.PremiumDiscount;
import br.edu.infnet.calebesantos.discountmanager.discounts.StandardDiscount;
import br.edu.infnet.calebesantos.discountmanager.discounts.VipDiscount;
import br.edu.infnet.calebesantos.discountmanager.discounts.VisitorDiscount;
import br.edu.infnet.calebesantos.discountmanager.discounts.interfaces.Discount;
import br.edu.infnet.calebesantos.discountmanager.discounts.interfaces.DiscountWithAccountTimeInYears;

public class DiscountFactory {
	public Discount getDiscountByAccountType(AccountType accountType) {
      switch (accountType) {
        case Visitor:
          return new VisitorDiscount();
        case Standard:
          return new StandardDiscount();
        case Premium:
          return new PremiumDiscount();
        case Vip:
          return new VipDiscount();
        default:
          throw new IllegalArgumentException("Tipo de conta inválida.");
      }
    }

    public DiscountWithAccountTimeInYears getDiscountByAccountTimeInYears(int accountTimeInYears) {
      return new AccountTimeInYearsDiscount(accountTimeInYears);
    }
}
