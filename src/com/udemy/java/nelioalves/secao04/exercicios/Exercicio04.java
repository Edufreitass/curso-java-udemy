package com.udemy.java.nelioalves.secao04.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Fazer um programa que leia o número de um funcionário, seu número de horas
	 * trabalhadas, o valor que recebe por hora e calcula o salário desse
	 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
	 * casas decimais.
	 * 
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numFuncionario = scan.nextInt();
		int horasTrab = scan.nextInt();
		double valorHora = scan.nextDouble();
		double salario = horasTrab * valorHora;

		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);

		scan.close();
	}

}
