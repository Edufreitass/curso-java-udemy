package com.udemy.java.nelioalves.secao15.aula144.application;

import java.util.Scanner;

import com.udemy.java.nelioalves.secao15.aula144.model.exceptions.DomainException;
import com.udemy.java.nelioalves.secao15.aula144.model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter account data:");

		System.out.print("Number: ");
		int number = scan.nextInt();

		System.out.print("Holder: ");
		scan.nextLine();
		String holder = scan.nextLine();

		System.out.print("Initial balance: ");
		double balance = scan.nextDouble();

		System.out.print("Withdraw limit: ");
		double withdrawLimit = scan.nextDouble();

		Account account = new Account(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = scan.nextDouble();

		try {
			account.withdraw(amount);
			System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		scan.close();
	}

}
