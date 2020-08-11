package com.udemy.java.nelioalves.secao06.aula43;

import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int num = scan.nextInt();

		int soma = 0;

		while (num != 0) {
			soma += num;
			System.out.println("Digite novamente um número inteiro:");
			num = scan.nextInt();
		}

		System.out.println("Soma: " + soma);

		scan.close();
	}

}
