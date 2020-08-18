package com.udemy.java.nelioalves.secao19.aula211.exercicio.fixacao.set.application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	/*
	 * Em um portal de cursos online, cada usuário possui um código único,
	 * representado por um número inteiro.
	 * 
	 * Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno
	 * pode se matricular em quantos cursos quiser. Assim, o número total de alunos
	 * de um instrutor não é simplesmente a soma dos alunos de todos os cursos que
	 * ele possui, pois pode haver alunos repetidos em mais de um curso.
	 * 
	 * O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total
	 * de alunos.
	 * 
	 * Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois
	 * mostrar a quantidade total e alunos dele, conforme exemplo.
	 */
	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("How many students for course A? ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int number = scan.nextInt();
			a.add(number);
		}

		System.out.print("How many students for course B? ");
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int number = scan.nextInt();
			b.add(number);
		}

		System.out.print("How many students for course C? ");
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int number = scan.nextInt();
			c.add(number);
		}

		// 'a' está sendo usado como base para comparar com os outros
		// cursos e verificar os alunos que estão presentes em mais de um curso
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());

		scan.close();
	}

}
