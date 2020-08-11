package com.udemy.java.nelioalves.secao04.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
	 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
	 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
		double preco1, preco2, total;

		cod1 = scan.nextInt();
		qte1 = scan.nextInt();
		preco1 = scan.nextDouble();

		cod2 = scan.nextInt();
		qte2 = scan.nextInt();
		preco2 = scan.nextDouble();

		total = preco1 * qte1 + preco2 * qte2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		scan.close();
	}

}
