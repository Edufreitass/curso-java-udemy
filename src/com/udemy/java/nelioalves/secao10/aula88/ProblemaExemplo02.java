package com.udemy.java.nelioalves.secao10.aula88;

import java.util.Scanner;

public class ProblemaExemplo02 {

	/*
	 * Fazer um programa para ler um número inteiro N e os dados (nome e preco) de N
	 * Produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preco
	 * medio dos produtos.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			scan.nextLine();
			String name = scan.nextLine();
			double price = scan.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		scan.close();
	}

}
