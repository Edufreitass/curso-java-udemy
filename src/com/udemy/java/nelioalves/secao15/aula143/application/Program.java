package com.udemy.java.nelioalves.secao15.aula143.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.udemy.java.nelioalves.secao15.aula143.model.entities.Reservation;
import com.udemy.java.nelioalves.secao15.aula143.model.exceptions.DomainException;

public class Program {

	// Terceira solução - boa
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int number = scan.nextInt();

			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(scan.next());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(scan.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");

			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(scan.next());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(scan.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		} catch (ParseException e) {
			System.out.println("Invalid date format!");
		} catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error!");
		}

		scan.close();
	}

}
