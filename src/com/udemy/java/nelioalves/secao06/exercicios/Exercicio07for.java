package com.udemy.java.nelioalves.secao06.exercicios;

import java.util.Scanner;

public class Exercicio07for {

	/*
	 * Fazer um programa para ler um número inteiro positivo N. O programa deve
	 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
	 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
	 * exemplo.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1143.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}

		scan.close();
	}

}
