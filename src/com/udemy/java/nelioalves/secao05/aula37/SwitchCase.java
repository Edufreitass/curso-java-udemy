package com.udemy.java.nelioalves.secao05.aula37;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero entre 1-7");
		int num = scan.nextInt();

		String dia;

		switch (num) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}

		System.out.println("Dia da semana: " + dia);

		scan.close();
	}

}
