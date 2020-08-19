package com.udemy.java.nelioalves.secao20.aula219.predicate.util;

import java.util.function.Predicate;

import com.udemy.java.nelioalves.secao20.aula219.predicate.entities.Product;

// Classe auxiliar
public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
