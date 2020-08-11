package com.udemy.java.nelioalves.secao06.exercicios;

import java.util.Scanner;

public class Exercicio05for {

	/*
	 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
	 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
	 * de 0 é 1.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}

		System.out.println(fat);

		scan.close();
	}

}
