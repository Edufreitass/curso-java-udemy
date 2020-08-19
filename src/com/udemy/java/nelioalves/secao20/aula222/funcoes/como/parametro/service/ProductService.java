package com.udemy.java.nelioalves.secao20.aula222.funcoes.como.parametro.service;

import java.util.List;
import java.util.function.Predicate;

import com.udemy.java.nelioalves.secao20.aula222.funcoes.como.parametro.entities.Product;

public class ProductService {

	// Função(método) que recebe outra função lambda como argumento
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
