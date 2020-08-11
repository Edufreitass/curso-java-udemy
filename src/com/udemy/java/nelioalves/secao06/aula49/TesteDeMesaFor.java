package com.udemy.java.nelioalves.secao06.aula49;

public class TesteDeMesaFor {

	public static void main(String[] args) {

		int x = 3;
		int y = 0;

		for (int i = 0; i < x; i++) {
			System.out.print(i + ",");
			y += 5;
			System.out.println(y);
		}

	}

}
