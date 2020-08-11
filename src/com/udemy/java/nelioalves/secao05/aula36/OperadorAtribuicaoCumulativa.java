package com.udemy.java.nelioalves.secao05.aula36;

import java.util.Scanner;

public class OperadorAtribuicaoCumulativa {

	/*
	 * Problema exemplo
	 * 
	 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
	 * dá direito a 100 minutos de telefone. Cada minuto que exceder a
	 * franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
	 * quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
	 * a ser pago.
	 * 
	 * ENTRADA				SAÍDA
	 * 22					Valor a pagar: R$ 50.00
	 * 103					Valor a pagar: R$ 56.00
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de minutos:");
		int minutos = scan.nextInt();

		double conta = 50.0;

		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}

		System.out.printf("Valor a pagar: R$ %.2f%n", conta);

		scan.close();
	}

}
