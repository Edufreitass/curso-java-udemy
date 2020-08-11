package com.udemy.java.nelioalves.secao08.aula70.exercicio;

import java.util.Scanner;

public class ProgramCurrencyConverter {

	/*
	 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
	 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
	 * pagar pelos dólares, considerando ainda que a pessoa rerá que pagar 6% de IOF
	 * sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
	 * responsável pelos cálculos.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is dollar price?");
		CurrencyConverter.dollarPrice = scan.nextDouble();

		System.out.println("How many dollars will be bought?");
		CurrencyConverter.dollarRequired = scan.nextDouble();

		System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.dollarToReal());

		scan.close();
	}

}
