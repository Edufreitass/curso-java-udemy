package com.udemy.java.nelioalves.secao05.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
	 * negativo ou não.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número inteiro:");
		int num = scan.nextInt();

		if (num >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		scan.close();
	}

}
