package com.udemy.java.nelioalves.secao10.aula87;

import java.util.Scanner;

public class ProblemaExemplo01 {

	/*
	 * Fazer um programa para ler um número inteiro N e a altura de N pessoa.
	 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas
	 * pessoas.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		double[] vect = new double[n];

		// for para ler o vetor
		for (int i = 0; i < n; i++) {
			vect[i] = scan.nextDouble();
		}

		double sum = 0.0;

		// for para guardar o valores na variavel soma para depois tirar a media
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum / n;

		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

		scan.close();
	}

}
