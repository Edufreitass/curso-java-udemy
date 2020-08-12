package com.udemy.java.nelioalves.secao15.aula139.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Eduardo\\eclipse-workspace\\curso-programacao\\src\\com\\udemy\\java\\nelioalves\\secao15\\aula139\\application\\files\\in.txt");
		Scanner scan = null;

		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (scan != null) {
				scan.close();
			}
			System.out.println("Finally block executed");
		}

	}

}
