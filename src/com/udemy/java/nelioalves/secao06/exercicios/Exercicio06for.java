package com.udemy.java.nelioalves.secao06.exercicios;

import java.util.Scanner;

public class Exercicio06for {

	/*
	 * Ler um número inteiro N e calcular todos os seus divisores.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1157.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		scan.close();
	}

}
