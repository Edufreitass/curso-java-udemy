package com.udemy.java.nelioalves.secao20.aula219.predicate.application;

import java.util.ArrayList;
import java.util.List;

import com.udemy.java.nelioalves.secao20.aula219.predicate.entities.Product;

public class Program {

	/*
	 * Problema exemplo
	 * 
	 * Fazer um programa que, a partir de uma lista de produtos, remova da lista
	 * somente aqueles cujo preço mínimo seja 100.
	 */

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
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// 1ª forma: Implementação da interface
//		list.removeIf(new ProductPredicate());
		
//		--------------------------------------------------------------------------------
		
		// 2ª forma: Reference method com método estático
//		list.removeIf(Product::staticProductPredicate);
		
//		--------------------------------------------------------------------------------
		
		// 3ª forma: Reference method com método não estático
//		list.removeIf(Product::nonStaticProductPredicate);
		
//		--------------------------------------------------------------------------------
		
		// 4ª forma: Expressão lambda declarada
		/*
		double min = 100.0;
		Predicate<Product> predicate = p -> p.getPrice() >= min;
		list.removeIf(predicate);
		*/
		
//		--------------------------------------------------------------------------------
		
		// 5ª forma: Expressão lambda inline
		list.removeIf(p -> p.getPrice() >= 100.0);
		
//		--------------------------------------------------------------------------------

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
