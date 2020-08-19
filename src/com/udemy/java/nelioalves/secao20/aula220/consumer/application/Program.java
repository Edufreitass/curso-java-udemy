package com.udemy.java.nelioalves.secao20.aula220.consumer.application;

import java.util.ArrayList;
import java.util.List;

import com.udemy.java.nelioalves.secao20.aula220.consumer.entities.Product;

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
	 * Fazer um programa que, a partir de uma lista de produtos, aumente o preço dos
	 * produtos em 10%.
	 */
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// 1ª forma: Implementação da interface
//		list.forEach(new PriceUpdate());

//		--------------------------------------------------------------------------------
		
		// 2ª forma: Reference method com método estático
//		list.forEach(Product::staticPriceUpdate);

//		--------------------------------------------------------------------------------	
		
		// 3ª forma: Reference method com método não estático
//		list.forEach(Product::nonStaticPriceUpdate);

//		--------------------------------------------------------------------------------	
		
		// 4ª forma: Expressão lambda declarada
		/*
		double factor = 1.1;
		Consumer<Product> consumer = p -> {
			p.setPrice(p.getPrice() * factor);
		};
		list.forEach(consumer);
		*/

//		--------------------------------------------------------------------------------	
		
		// 5ª forma: Expressão lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

//		--------------------------------------------------------------------------------	
	
		// Imprime a lista, usando o método forEach() e também o "method reference" chamando o "println()
		list.forEach(System.out::println);
	}

}
