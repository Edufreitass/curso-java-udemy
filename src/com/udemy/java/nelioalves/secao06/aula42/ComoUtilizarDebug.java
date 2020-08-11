package com.udemy.java.nelioalves.secao06.aula42;

import java.util.Scanner;

public class ComoUtilizarDebug {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double largura = scan.nextDouble();
		double comprimento = scan.nextDouble();
		double metroQuadrado = scan.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		scan.close();
	}

}
