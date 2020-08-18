package com.udemy.java.nelioalves.secao18.aula199.services;

public class BrazilInterestService implements InterestService {

	private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
