package com.udemy.java.nelioalves.secao05.aula33;

import java.util.Scanner;

public class EstruturaCondicionalIfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantas horas?");
		int hora = scan.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		scan.close();
	}

}
