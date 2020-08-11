package com.udemy.java.nelioalves.secao05.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	/*
	 * Você deve fazer um programa que leia um valor qualquer e apresente uma
	 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
	 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
	 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero:");
		double numero = scan.nextDouble();

		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		} else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}

		scan.close();

	}

}
