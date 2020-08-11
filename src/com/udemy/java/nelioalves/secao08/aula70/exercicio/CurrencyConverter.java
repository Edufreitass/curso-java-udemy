package com.udemy.java.nelioalves.secao08.aula70.exercicio;

public class CurrencyConverter {

	public static double dollarPrice;

	public static double dollarRequired;

	public static double dollarToReal() {
		double tax = dollarRequired * 0.06 * dollarPrice;
		return dollarRequired * dollarPrice + tax;
	}

}
