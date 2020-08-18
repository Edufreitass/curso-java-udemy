package com.udemy.java.nelioalves.secao19.aula204.wildcard.types;

import java.util.Arrays;
import java.util.List;

public class ProgramExemplo02 {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	// Método que recebe uma lista de qualquer tipo(tipo curinga '?')
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
