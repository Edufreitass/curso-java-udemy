package com.udemy.java.nelioalves.secao06.aula48;

import java.util.Scanner;

public class EstruturaRepetitivaFor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int soma = 0;

		for (int i = 0; i < N; i++) {
			int x = scan.nextInt();
			soma += x;
		}

		System.out.println("Soma: " + soma);

		scan.close();
	}

}
