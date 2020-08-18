package com.udemy.java.nelioalves.secao18.aula199.services;

import java.security.InvalidParameterException;

// Default methods (defender methods)
public interface InterestService {

	double getInterestRate();

	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}

}
