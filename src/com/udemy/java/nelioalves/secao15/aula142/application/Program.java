package com.udemy.java.nelioalves.secao15.aula142.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.udemy.java.nelioalves.secao15.aula142.model.entities.Reservation;

public class Program {

	// Segunda solução - ruim
	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = scan.nextInt();

		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(scan.next());

		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(scan.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date!");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");

			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(scan.next());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(scan.next());

			String error = reservation.updateDates(checkIn, checkOut);
			if (error != null) {
				System.out.println("Error in reservation: " + error);
			} else {
				System.out.println("Reservation: " + reservation);
			}
		}

		scan.close();
	}

}
