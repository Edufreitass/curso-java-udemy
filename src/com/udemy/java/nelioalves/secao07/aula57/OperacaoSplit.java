package com.udemy.java.nelioalves.secao07.aula57;

public class OperacaoSplit {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String s = "potato apple lemon";

		String[] vetor = s.split(" ");
		String s1 = vetor[0];
		String s2 = vetor[1];
		String s3 = vetor[2];

		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);

//		for (String array : vetor) {
//			System.out.println(array);
//		}

	}

}
