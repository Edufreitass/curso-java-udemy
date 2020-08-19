package com.udemy.java.nelioalves.secao20.aula224.pipeline.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String... args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		// Operação intermediária: map(x -> x * 10);
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		// Operação terminal: toArray()
		System.out.println(Arrays.toString(st1.toArray()));
		
		// Operação terminal: reduce()
		// reduce() ele pega o elemento inicial e depois uma função que recebe 2 argumentos e gera o resultado
		// Essa operação faz o somátório da lista
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);
		// Essa operação faz o produtório da lista
//		int sum = list.stream().reduce(1, (x, y) -> x * y);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
		
	}
	
}
