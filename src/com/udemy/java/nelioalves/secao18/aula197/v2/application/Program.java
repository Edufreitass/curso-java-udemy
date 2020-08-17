package com.udemy.java.nelioalves.secao18.aula197.v2.application;

import com.udemy.java.nelioalves.secao18.aula197.v2.devices.ComboDevice;
import com.udemy.java.nelioalves.secao18.aula197.v2.devices.ConcretePrinter;
import com.udemy.java.nelioalves.secao18.aula197.v2.devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());

	}
}
