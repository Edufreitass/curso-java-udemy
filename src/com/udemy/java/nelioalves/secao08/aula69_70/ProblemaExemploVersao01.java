package com.udemy.java.nelioalves.secao08.aula69_70;

import java.util.Scanner;

public class ProblemaExemploVersao01 {

	/*
	 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto
	 * seria o valor de uma circunferência e do volume de uma esfera para um raio
	 * daquele valor. Informar também o valor de PI com duas casas decimais.
	 */

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = scan.nextDouble();

		double c = circumference(radius);

		double v = volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);

		scan.close();
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
