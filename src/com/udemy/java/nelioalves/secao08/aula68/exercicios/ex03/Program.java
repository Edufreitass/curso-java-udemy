package com.udemy.java.nelioalves.secao08.aula68.exercicios.ex03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Student student = new Student();

		student.name = scan.nextLine();
		student.grade1 = scan.nextDouble();
		student.grade2 = scan.nextDouble();
		student.grade3 = scan.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}

		scan.close();
	}

}
