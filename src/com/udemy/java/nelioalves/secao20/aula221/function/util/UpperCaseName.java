package com.udemy.java.nelioalves.secao20.aula221.function.util;

import java.util.function.Function;

import com.udemy.java.nelioalves.secao20.aula221.function.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
