package com.udemy.java.nelioalves.secao20.aula216.comparator.application;

import java.util.ArrayList;
import java.util.List;

import com.udemy.java.nelioalves.secao20.aula216.comparator.entities.Product;

public class Program {

	/*
	 * 	Resumo da aula
	 * 
	 *	• Comparator objeto de classe separada
	 *	
	 *	• Comparator objeto de classe anônima
	 *	
	 *	• Comparator objeto de expressão lambda com chaves
	 *	
	 *	• Comparator objeto de expressão lambda sem chaves
	 *	
	 *	• Comparator expressão lambda "direto no argumento"
	 */
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// 1ª forma, utilizando uma classe externa
//		list.sort(new MyComparator());
		
//		--------------------------------------------------------------------------------

		// 2ª forma, utilizando uma classe anonima
		/*
		Comparator<Product> comparator = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		
		list.sort(comparator);
		*/
		
//		--------------------------------------------------------------------------------
		
		// 3ª forma, utilizando expressão lambda
		/*
		Comparator<Product> comparator = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		

		list.sort(comparator);
		*/
		
//		--------------------------------------------------------------------------------
		
		// 4ª forma, reduzindo o tamanho da expressão lambda
		/*
		Comparator<Product> comparator = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

		list.sort(comparator);
		*/
		
//		--------------------------------------------------------------------------------
		
		// 5ª forma, passando a expressao diretamente como parametro no metodo sort()
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
//		--------------------------------------------------------------------------------
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
