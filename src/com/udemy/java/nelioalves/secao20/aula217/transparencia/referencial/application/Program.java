package com.udemy.java.nelioalves.secao20.aula217.transparencia.referencial.application;

import java.util.Arrays;

public class Program {

	/*
	 * Transparência referencial
	 * 
	 * Uma função possui transparência referencial se seu resultado for sempre o
	 * mesmo para os mesmos dados de entrada. Benefícios: simplicidade e
	 * previsibilidade.
	 */

	public static int globalValue = 3;

	public static void main(String[] args) {

		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}

	// Exemplo de função que não é referencialmente transparente,
	// pois o resultado da funçao depende exclusivamente dos valores de entrada
	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
}
