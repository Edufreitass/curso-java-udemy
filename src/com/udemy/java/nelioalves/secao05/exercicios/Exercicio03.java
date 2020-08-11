package com.udemy.java.nelioalves.secao05.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	/*
	 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
	 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
	 * crescente ou decrescente.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero inteiro:");
		int A = scan.nextInt();

		System.out.println("Entre com outro numero inteiro:");
		int B = scan.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são Multiplos");
		}

		scan.close();
	}

}
