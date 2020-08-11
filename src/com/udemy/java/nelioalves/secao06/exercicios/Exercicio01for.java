package com.udemy.java.nelioalves.secao06.exercicios;

import java.util.Scanner;

public class Exercicio01for {

	/*
	 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
	 * até X, um valor por linha, inclusive o X, se for o caso.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		scan.close();
	}

}
