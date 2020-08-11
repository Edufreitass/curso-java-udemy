package com.udemy.java.nelioalves.secao08.aula62.application;

import java.util.Scanner;

public class ProgramWithoutOO {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;

		System.out.println("Enter the measures of triangle X: ");
		xA = scan.nextDouble();
		xB = scan.nextDouble();
		xC = scan.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		yA = scan.nextDouble();
		yB = scan.nextDouble();
		yC = scan.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		scan.close();
	}

}
