package com.udemy.java.nelioalves.secao05.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
	 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
	 * 
	 * CODIGO		ESPECIFICACAO		PRECO
	 *    1			 Cachorro Quente	 R$ 4.00
	 *    2			 X-Salada			 R$ 4.50
	 *    3			 X-Bacon			 R$ 5.00
	 *    4			 Torrada Simples	 R$ 2.00
	 *    5			 Refrigerante		 R$ 1.50
	 *    
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o código do item:");
		int codigo = scan.nextInt();

		System.out.println("Entre com a quantidade:");
		int quantidade = scan.nextInt();

		double total;

		if (codigo == 1) {
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.5;
		} else if (codigo == 3) {
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			total = quantidade * 2.0;
		} else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		scan.close();
	}

}
