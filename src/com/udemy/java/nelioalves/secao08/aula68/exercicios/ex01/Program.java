package com.udemy.java.nelioalves.secao08.aula68.exercicios.ex01;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.println("Enter rectangle width and height");
		rectangle.width = scan.nextDouble();
		rectangle.height = scan.nextDouble();

		System.out.println(rectangle);

		scan.close();
	}

}
