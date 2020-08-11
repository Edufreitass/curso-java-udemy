package com.udemy.java.nelioalves.secao06.exercicios;

import java.util.Scanner;

public class Exercicio01while {

	/*
	 * Escreva um programa que repita a leitura de uma senha até que ela seja
	 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
	 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
	 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
	 * correta é o valor 2002.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int senha = scan.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = scan.nextInt();
		}

		System.out.println("Acesso Permitido");

		scan.close();
	}

}
