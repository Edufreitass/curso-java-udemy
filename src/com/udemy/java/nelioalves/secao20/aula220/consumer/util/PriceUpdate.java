package com.udemy.java.nelioalves.secao20.aula220.consumer.util;

import java.util.function.Consumer;

import com.udemy.java.nelioalves.secao20.aula220.consumer.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		// 1.1 é igual a 10%
		p.setPrice(p.getPrice() * 1.1);
	}

}
