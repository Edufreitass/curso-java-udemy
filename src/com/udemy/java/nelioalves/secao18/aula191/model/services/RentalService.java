package com.udemy.java.nelioalves.secao18.aula191.model.services;

import com.udemy.java.nelioalves.secao18.aula191.model.entities.CarRental;
import com.udemy.java.nelioalves.secao18.aula191.model.entities.Invoice;

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
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		// (t2 - t1) = dif em ms, 1000=seg , 60=min , 60=horas
		double hours = (double) (t2 - t1) / 1000 / 60 / 60;

		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));

	}

}
