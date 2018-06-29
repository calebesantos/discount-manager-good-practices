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
    public double Calculate(double amount, int type, int years)
    {
        double result = 0;

        double disc = (years > 5) ? (double)5 / 100 : (double)years / 100;

        if (type == 1)
        {
            result = amount;
        }
        else if (type == 2)
        {
            result = (amount - (0.1 * amount)) - disc * (amount - (0.1 * amount));
        }
        else if (type == 3)
        {
            result = (0.7 * amount) - disc * (0.7 * amount);
        }
        else if (type == 4)
        {
            result = (amount - (0.5 * amount)) - disc * (amount - (0.5 * amount));
        }

        return result;
    }
}