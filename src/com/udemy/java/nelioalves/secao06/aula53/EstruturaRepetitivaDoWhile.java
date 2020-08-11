package com.udemy.java.nelioalves.secao06.aula53;

import java.util.Scanner;

public class EstruturaRepetitivaDoWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char resp;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = scan.nextDouble();

			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);

			System.out.print("Deseja repetir (s/n)? ");
			resp = scan.next().charAt(0);
		} while (resp != 'n');

		scan.close();
	}

}
