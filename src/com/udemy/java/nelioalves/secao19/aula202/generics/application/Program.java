package com.udemy.java.nelioalves.secao19.aula202.generics.application;

import java.util.Scanner;

import com.udemy.java.nelioalves.secao19.aula202.generics.services.PrintService;

public class Program {

	/*
	 * Generics
	 * 
	 * • Generics permitem que classes, interfaces e métodos possam ser
	 * parametrizados por tipo. Seus benefícios são:
	 * 
	 * • Reuso
	 * • Type safety •Performance
	 * • Uso comum: coleções
	 *
	 * List<String> list = new ArrayList<>(); 
	 * list.add("Maria");
	 * String name = list.get(0);
	 * 
	 * Solução com generics
	 * 
	 * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
	 * inteiros. Ao final, imprima esses números de forma organizada conforme
	 * exemplo. Em seguida, informar qual foi o primeiro valor informado.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int value = scan.nextInt();
			ps.addValue(value);
		}

		ps.print();
		System.out.println("First: " + ps.first());

		scan.close();
	}

}
