package com.udemy.java.nelioalves.secao09.exercicio.entities;

public class Account {

	private int number; // numero da conta
	private String holder; // titular
	private double balance; // saldo

	// construtor que não recebe um deposito inicial
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	// construtor que recebe um deposito inicial
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	// deposito
	public void deposit(double amount) {
		balance += amount;
	}

	// saque com uma taxa de R$ 5.00
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
