package com.udemy.java.nelioalves.secao04.aula24_25;
import java.util.Scanner;

public class EntradaDeDadosParte01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Leitura de String
		String x;
		x = scan.next();
		System.out.println("Você digitou: " + x);

		// Leitura de Inteiro
		int y;
		y = scan.nextInt();
		System.out.println("Você digitou: " + y);

		// Leitura de Ponto Flutuante
		double z;
		z = scan.nextDouble();
		System.out.println("Você digitou: " + z);

		// Leitura de Caracter(char)
		char u;
		u = scan.next().charAt(0);
		System.out.println("Você digitou: " + u);

		// Leitura de vários dados na mesma linha, separados por espaço
		String a;
		int b;
		double c;
		a = scan.next();
		b = scan.nextInt();
		c = scan.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		scan.close();
	}

}
