package br.edu.infnet.calebesantos.discountmanager.discounts;

import br.edu.infnet.calebesantos.discountmanager.discounts.interfaces.DiscountWithAccountTimeInYears;

public class AccountTimeInYearsDiscount implements DiscountWithAccountTimeInYears {

	private final double _maximumDiscountForAccountTime = 0.05;

    private int accountTimeInYears;

    public AccountTimeInYearsDiscount(int accountTimeInYears) {
      this.accountTimeInYears = accountTimeInYears;
    }
    
    @Override
    public int getAccountTimeInYears() {
    	return accountTimeInYears;
    }

    @Override
    public double getDiscount() {
      double discount = (double)accountTimeInYears / 100;

      if (discount > _maximumDiscountForAccountTime)
        return _maximumDiscountForAccountTime;
      
      return discount;
    }

}
