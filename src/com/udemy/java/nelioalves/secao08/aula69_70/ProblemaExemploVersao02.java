package com.udemy.java.nelioalves.secao08.aula69_70;

import java.util.Scanner;

import com.udemy.java.nelioalves.secao08.aula69_70.util.CalculatorVersao02;

public class ProblemaExemploVersao02 {

	/*
	 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto
	 * seria o valor de uma circunferência e do volume de uma esfera para um raio
	 * daquele valor. Informar também o valor de PI com duas casas decimais.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		CalculatorVersao02 calc = new CalculatorVersao02();

		System.out.println("Enter radius: ");
		double radius = scan.nextDouble();

		double c = calc.circumference(radius);

		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		scan.close();
	}

}
