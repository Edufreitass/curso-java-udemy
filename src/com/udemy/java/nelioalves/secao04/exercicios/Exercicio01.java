package com.udemy.java.nelioalves.secao04.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
	 * soma desses números com uma mensagem explicativa, conforme exemplos.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		int soma = valor1 + valor2;

		System.out.println("SOMA = " + soma);

		scan.close();
	}

}
