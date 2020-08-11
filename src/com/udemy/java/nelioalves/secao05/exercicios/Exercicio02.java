package com.udemy.java.nelioalves.secao05.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
	 * ímpar.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número inteiro:");
		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		scan.close();
	}
}
