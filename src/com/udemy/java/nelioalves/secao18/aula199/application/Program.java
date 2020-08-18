package com.udemy.java.nelioalves.secao18.aula199.application;

import java.util.Scanner;

import com.udemy.java.nelioalves.secao18.aula199.services.BrazilInterestService;
import com.udemy.java.nelioalves.secao18.aula199.services.InterestService;

public class Program {

	/*
	 * Problema exemplo
	 * 
	 * Fazer um programa para ler uma quantia e a duração em meses de um empréstimo.
	 * Informar o valor a ser pago depois de decorrido o prazo do empréstimo,
	 * conforme regras de juros do Brasil. A regra de cálculo de juros do Brasil é
	 * juro composto padrão de 2% ao mês.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = scan.nextDouble();
		System.out.print("Months: ");
		int months = scan.nextInt();

		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);

		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));

		scan.close();
	}

}
