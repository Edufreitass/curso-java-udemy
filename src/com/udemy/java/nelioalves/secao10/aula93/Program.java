package com.udemy.java.nelioalves.secao10.aula93;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// inserindo na posição especifica
		list.add(2, "Marco");

		// tamanho da lista
		System.out.println(list.size());

		// Leitura: PARA CADA String x PERTENCENTE A
		// MINHA LISTA list IMPRIMA NA TELA O VALOR DE x
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------");

		// remover um elemento da lista
//		list.remove("Anna");
//		list.remove(1);
		// PREDICADO, retorna TRUE ou FALSE
		// Leitura: Pega um valor x, do tipo String,
		// e me retorna se o x.charAt(0) é igual a 'M'
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------");

		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("--------------");

		// Deixar na lista somente quem tem o nome começando com a letra 'M'
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("--------------");

		// Encontrar o primeiro elemento que atenda o Predicate(Predicado)
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}

}
