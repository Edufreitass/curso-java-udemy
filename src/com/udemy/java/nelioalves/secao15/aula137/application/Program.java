package com.udemy.java.nelioalves.secao15.aula137.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			String[] vect = scan.nextLine().split(" ");
			int position = scan.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}

		System.out.println("End of program");

		scan.close();
	}

}
