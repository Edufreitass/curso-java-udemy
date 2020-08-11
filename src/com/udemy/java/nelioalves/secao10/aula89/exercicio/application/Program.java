package com.udemy.java.nelioalves.secao10.aula89.exercicio.application;

import java.util.Scanner;

import com.udemy.java.nelioalves.secao10.aula89.exercicio.entities.Rent;

public class Program {

	/*
	 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo
	 * esses quartos identificados pelos números 0 a 9. Fazer um programa que inicie
	 * com todos os dez quartos vazios, e depois leia uma quantidade N representando
	 * o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em
	 * seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel,
	 * informar o nome e email do estudante, bem como qual dos quartos ele escolheu
	 * (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa
	 * deve imprimir um relatório de todas ocupações do pensionato, por ordem de
	 * quarto, conforme exemplo.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println();
			System.out.println("Rent #" + i + ":");

			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();

			System.out.print("Email: ");
			String email = scan.nextLine();

			System.out.print("Room: ");
			int room = scan.nextInt();

			vect[room] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		scan.close();
	}

}
