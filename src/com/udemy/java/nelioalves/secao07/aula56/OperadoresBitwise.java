package com.udemy.java.nelioalves.secao07.aula56;

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {

		int n1 = 89;
		int n2 = 60;

		// compara cada número bit a bit
		System.out.println(n1 & n2); // &: 0001 1000 	(24)
		System.out.println(n1 | n2); // |: 0111 1101 	(125)
		System.out.println(n1 ^ n2); // ^: 0110 0101 	(101)

		Scanner scan = new Scanner(System.in);

//		int mask = 32;
		int mask = 0b100000;
		int n = scan.nextInt();

		// testa se o 6 bit do n vale 1
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}

		scan.close();
	}

}
