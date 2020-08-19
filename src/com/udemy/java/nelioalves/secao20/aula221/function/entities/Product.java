package com.udemy.java.nelioalves.secao20.aula221.function.entities;

public class Product {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// 2ª forma
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}

	// 3ª forma
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

}
