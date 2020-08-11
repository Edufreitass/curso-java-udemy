package com.udemy.java.nelioalves.secao05.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
	 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
	 * uma duração mínima de 1 hora e máxima de 24 horas.
	 *
	 * Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a hora inicial do jogo:");
		int horaInicial = scan.nextInt();

		System.out.println("Entre com a hora final do jogo:");
		int horaFinal = scan.nextInt();

		int duracao;

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		scan.close();
	}

}
