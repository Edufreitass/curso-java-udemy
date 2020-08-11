package com.udemy.java.nelioalves.secao04.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
	 * valor da área deste círculo com quatro casas decimais conforme exemplos.
	 * 
	 * Fórmula da área: area = π . raio2
	 * 
	 * Considere o valor de π = 3.14159
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1002.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double raio = scan.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2.0);

		System.out.printf("A = %.4f", area);

		scan.close();
	}

}
