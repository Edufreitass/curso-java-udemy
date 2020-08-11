package com.udemy.java.nelioalves.secao04.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	/*
	 * Fazer um programa que leia três valores com ponto flutuante de dupla
	 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
	 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
	 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
	 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
	 * e B.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();

		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		scan.close();

	}

}
