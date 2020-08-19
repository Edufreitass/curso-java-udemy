package com.udemy.java.nelioalves.secao20.aula222.funcoes.como.parametro.application;

import java.util.ArrayList;
import java.util.List;

import com.udemy.java.nelioalves.secao20.aula222.funcoes.como.parametro.entities.Product;
import com.udemy.java.nelioalves.secao20.aula222.funcoes.como.parametro.service.ProductService;

public class Program {

	/*
	 * Recordando
	 * 
	 * • removeIf(Predicate)
	 * 
	 * • foreach(Consumer)
	 * 
	 * • map(Function)
	 */

	/*
	 * Problema exemplo
	 * 
	 * Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos
	 * preços somente dos produtos cujo nome começa com "T".
	 */
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService ps = new ProductService();

		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

		System.out.println("Sum = " + String.format("%.2f", sum));

	}

}
