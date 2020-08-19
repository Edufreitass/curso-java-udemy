package com.udemy.java.nelioalves.secao20.aula216.comparator.application;

import java.util.Comparator;

import com.udemy.java.nelioalves.secao20.aula216.comparator.entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
