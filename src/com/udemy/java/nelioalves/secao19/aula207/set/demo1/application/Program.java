package com.udemy.java.nelioalves.secao19.aula207.set.demo1.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();

		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

//		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');

		for (String p : set) {
			System.out.println(p);
		}

	}

}
