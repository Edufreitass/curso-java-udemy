package com.udemy.java.nelioalves.secao18.aula192.model.services;

public class BrazilTaxService implements TaxService {

	@Override
	public double tax(double amount) {
		if (amount <= 100.0) {
			return amount * 0.2;
		} else {
			return amount * 0.15;
		}
	}

}
