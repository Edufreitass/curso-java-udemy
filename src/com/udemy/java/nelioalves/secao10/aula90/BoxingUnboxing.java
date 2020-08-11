package com.udemy.java.nelioalves.secao10.aula90;

public class BoxingUnboxing {

	public static void main(String[] args) {

		int x = 20;

		// BOXING
		Object obj = x;
		System.out.println(x);

		// UNBOXING
		int y = (int) obj;
		System.out.println(y);
	}

}
