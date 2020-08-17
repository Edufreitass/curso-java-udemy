package com.udemy.java.nelioalves.secao18.aula197.v1.application;

import com.udemy.java.nelioalves.secao18.aula197.v1.devices.Printer;
import com.udemy.java.nelioalves.secao18.aula197.v1.devices.Scanner;

public class Program {

	public static void main(String[] args) {

		Printer p = new Printer("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		Scanner s = new Scanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

	}
}
