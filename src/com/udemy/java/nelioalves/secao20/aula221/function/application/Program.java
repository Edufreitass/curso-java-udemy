package com.udemy.java.nelioalves.secao20.aula221.function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.udemy.java.nelioalves.secao20.aula221.function.entities.Product;

public class Program {

	/*
	 * Versões:
	 * 
	 * • Implementação da interface
	 * 
	 * • Reference method com método estático
	 * 
	 * • Reference method com método não estático
	 * 
	 * • Expressão lambda declarada
	 * 
	 * • Expressão lambda inline
	 */

	/*
	 * Problema exemplo
	 * 
	 * Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista
	 * contendo os nomes dos produtos em caixa alta.
	 */

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// 1ª forma: Implementação da interface
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

//		--------------------------------------------------------------------------------

		// 2ª forma: Reference method com método estático
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

//		--------------------------------------------------------------------------------	

		// 3ª forma: Reference method com método não estático
//		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

//		--------------------------------------------------------------------------------	

		// 4ª forma: Expressão lambda declarada
		/*
		Function<Product, String> function = p -> p.getName().toUpperCase();
		List<String> names = list.stream().map(function).collect(Collectors.toList());
		*/

//		--------------------------------------------------------------------------------	

		// 5ª forma: Expressão lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

//		--------------------------------------------------------------------------------	

		names.forEach(System.out::println);
	}

}
