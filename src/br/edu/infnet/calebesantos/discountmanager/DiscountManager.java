package br.edu.infnet.calebesantos.discountmanager;

import java.util.List;

import br.edu.infnet.calebesantos.discountmanager.accounts.factories.AccountFactory;
import br.edu.infnet.calebesantos.discountmanager.accounts.interfaces.Account;
import br.edu.infnet.calebesantos.discountmanager.discounts.factories.DiscountFactory;
import br.edu.infnet.calebesantos.discountmanager.discounts.interfaces.Discount;
import br.edu.infnet.calebesantos.discountmanager.discounts.metadata.DiscountType;
import br.edu.infnet.calebesantos.discountmanager.discounts.models.DiscountOptions;

/**
 * DiscountManager ------------------------
 * 
 * Sua responsabilidade é calcular o desconto para o consumidor quando esse está
 * em um processo de compra na loja online.
 * 
 * Difícil de ler, difícil manutenção, difícil de extender.
 * 
 * - Nomes - Desperdício de tempo, gasto na tentativa de entender o código. -
 * Números mágicos - O tipo é relativo ao estado da conta do consumidor. Mas
 * qual estado é indicado por cada número? - Bug não muito óbvio - E se um novo
 * tipo de consumidor fosse adicionado? - Mais números mágicos - O que
 * significam o 0.1, o 0.7 e o 0.5? Valor máximo de desconto, em percentual,
 * para aquele consumidor. - DRY - disc * (amount - (0.1m * amount)); == disc *
 * (amount - (0.5 * amount)); - Múltiplas responsabilidades - 1. Escolha do
 * algoritmo para o cálculo 2. Cálculo do desconto para um dado estado da conta
 * do consumidor 3. Cálculo do desconto para o tempo de cadastro do consumidor
 **/
public class DiscountManager {
	private final DiscountFactory _discountFactory;
	private final AccountFactory _accountFactory;

	public DiscountManager(DiscountFactory discountFactory, AccountFactory accountFactory) {
		_discountFactory = discountFactory;
		_accountFactory = accountFactory;
	}

	public double ApplyDiscount(double originalPrice, AccountType accountType, int accountTimeInYears) {
		DiscountOptions discountOptions = new DiscountOptions(accountTimeInYears);

		Account account = _accountFactory.getAccountByType(accountType);
		List<DiscountType> accountDiscounts = account.getDiscounts();

		List<Discount> descontos = _discountFactory.getDiscountsByDiscountTypeList(accountDiscounts, discountOptions);

		return ApplyDiscount(originalPrice, descontos);
	}

	public double ApplyDiscount(double originalPrice, List<Discount> discounts) {
		double priceWithDiscount = originalPrice;
		for (Discount discount : discounts) {
			priceWithDiscount -= priceWithDiscount * discount.getDiscount();
		}
		return priceWithDiscount;
	}
}