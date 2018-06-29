package br.edu.infnet.calebesantos.discountmanager;

/**
 * DiscountManager
 * ------------------------
 * 
 * Sua responsabilidade é calcular o desconto para o consumidor 
 * quando esse está em um processo de compra na loja online.
 * 
 * Difícil de ler, difícil manutenção, difícil de extender.
 * 
 * - Nomes - Desperdício de tempo, gasto na tentativa de entender o código.
 * - Números mágicos - O tipo é relativo ao estado da conta do consumidor.
 * Mas qual estado é indicado por cada número? 
 * - Bug não muito óbvio - E se um novo tipo de consumidor fosse adicionado?
 * - Mais números mágicos - O que significam o 0.1, o 0.7 e o 0.5? 
 * Valor máximo de desconto, em percentual, para aquele consumidor.
 * - DRY - disc * (amount - (0.1m * amount)); == disc * (amount - (0.5 * amount));
 * - Múltiplas responsabilidades - 
 *      1. Escolha do algoritmo para o cálculo
 *      2. Cálculo do desconto para um dado estado da conta do consumidor
 *      3. Cálculo do desconto para o tempo de cadastro do consumidor
 **/
public class DiscountManager
{
    public double ApplyDiscount(double originalPrice, int accountType, int accountTimeInYears)
    {
        double priceWithDiscount = 0;

        double accountTimeDiscount = (accountTimeInYears > 5) ? (double)5 / 100 : (double)accountTimeInYears / 100;

        if (accountType == 1)
        {
            priceWithDiscount = originalPrice;
        }
        else if (accountType == 2)
        {
            priceWithDiscount = (originalPrice - (0.1 * originalPrice)) - accountTimeDiscount * (originalPrice - (0.1 * originalPrice));
        }
        else if (accountType == 3)
        {
            priceWithDiscount = (0.7 * originalPrice) - accountTimeDiscount * (0.7 * originalPrice);
        }
        else if (accountType == 4)
        {
            priceWithDiscount = (originalPrice - (0.5 * originalPrice)) - accountTimeDiscount * (originalPrice - (0.5 * originalPrice));
        }

        return priceWithDiscount;
    }
}