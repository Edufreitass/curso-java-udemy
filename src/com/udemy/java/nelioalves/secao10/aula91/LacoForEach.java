package com.udemy.java.nelioalves.secao10.aula91;

public class LacoForEach {

	/*
	 * Laço "for each"
	 * 
	 * Sintaxe opcional e simplificada para percorrer coleções
	 * 
	 * Sintaxe:
	 * 
	 * for (Tipo apelido: coleção) {
	 * 		<comando 1>
	 * 		<comando 2>
	 * }
	 */
	
	public static void main(String[] args) {

		String[] vect = {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println();
		
		// Leitura: "PARA CADA OBJETO 'obj' CONTIDO EM 'vect', FAÇA:"
		for (String obj : vect) {
			System.out.println(obj); // equivale a "System.out.println(vect[i]);"
		}
		
	}

}
