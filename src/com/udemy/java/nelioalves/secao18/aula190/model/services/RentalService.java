package com.udemy.java.nelioalves.secao18.aula190.model.services;

import com.udemy.java.nelioalves.secao18.aula190.model.entities.CarRental;

@SuppressWarnings("unused")
public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;

	private BrazilTaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {

	}

}
