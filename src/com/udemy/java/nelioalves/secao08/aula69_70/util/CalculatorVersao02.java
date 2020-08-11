package com.udemy.java.nelioalves.secao08.aula69_70.util;

public class CalculatorVersao02 {

	public final double PI = 3.14159;

	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
