package com.udemy.java.nelioalves.secao06.exercicios;

import java.util.Scanner;

public class Exercicio04for {

	/*
	 * Fazer um programa para ler um número N. Depois leia N pares de números e
	 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
	 * mostrar a mensagem "divisao impossivel".
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1116.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {

			int x = scan.nextInt();
			int y = scan.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}

		scan.close();
	}

}
