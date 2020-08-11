package com.udemy.java.nelioalves.secao10.aula97;

import java.util.Scanner;

public class Program {

	/*
	 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N
	 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a
	 * quantidade de valores negativos da matriz.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) { // linhas
			for (int j = 0; j < mat[i].length; j++) { // colunas
				mat[i][j] = scan.nextInt();
			}
		}

		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int count = 0;
		for (int i = 0; i < mat.length; i++) { // linhas
			for (int j = 0; j < mat[i].length; j++) { // colunas
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("Negative numbers = " + count);

		scan.close();
	}

}
