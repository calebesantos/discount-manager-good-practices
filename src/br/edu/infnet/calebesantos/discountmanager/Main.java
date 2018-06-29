package br.edu.infnet.calebesantos.discountmanager;

public class Main {

	public static void main(String[] args) {
		DiscountManager discountManager = new DiscountManager();
		double discount = discountManager.Calculate(5.0, 2, 5);
		System.out.println(discount);
	}

}
