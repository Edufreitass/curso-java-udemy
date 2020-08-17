package com.udemy.java.nelioalves.secao18.aula192.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.udemy.java.nelioalves.secao18.aula192.model.entities.CarRental;
import com.udemy.java.nelioalves.secao18.aula192.model.entities.Vehicle;
import com.udemy.java.nelioalves.secao18.aula192.model.services.BrazilTaxService;
import com.udemy.java.nelioalves.secao18.aula192.model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String carModel = scan.nextLine();
		System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
		Date start = sdf.parse(scan.nextLine());
		System.out.print("Return (dd/MM/yyyy hh:ss): ");
		Date finish = sdf.parse(scan.nextLine());

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter price per hour: ");
		double pricePerHour = scan.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = scan.nextDouble();

		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

		rentalService.processInvoice(cr);

		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		scan.close();
	}

}
