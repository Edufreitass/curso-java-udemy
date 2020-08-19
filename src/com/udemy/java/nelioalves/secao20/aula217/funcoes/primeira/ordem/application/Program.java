package com.udemy.java.nelioalves.secao20.aula217.funcoes.primeira.ordem.application;

import java.util.ArrayList;
import java.util.List;

import com.udemy.java.nelioalves.secao20.aula217.funcoes.primeira.ordem.entities.Product;

public class Program {

	/*
	 * Funções são objetos de primeira ordem (ou primeira classe)
	 * 
	 * Isso significa que funções podem, por exemplo, serem passadas como parâmetros
	 * de métodos, bem como retornadas como resultado de métodos.
	 */

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	/*
	 * 		Utilizamos aqui 
	 * 	  "method references" 
	 * 
	 * 		   Operador :: 
	 * 
	 * 		    Sintaxe: 
	 * 		 Classe::método
	 */
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.sort(Program::compareProducts);

		list.forEach(System.out::println);
	}

}
