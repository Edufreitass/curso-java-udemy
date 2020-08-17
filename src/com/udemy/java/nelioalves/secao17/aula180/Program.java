package com.udemy.java.nelioalves.secao17.aula180;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Eduardo\\Desktop\\in.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
			// verifica se existe uma proxima linha no arquivo
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (scan != null) {
				scan.close();
			}
		}

	}

}
