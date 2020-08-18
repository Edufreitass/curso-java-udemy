package com.udemy.java.nelioalves.secao19.aula206.application;

import com.udemy.java.nelioalves.secao19.aula206.entities.Client;

public class Program {

	public static void main(String[] args) {

		String a = "Maria";
		String b = "Alex";

		/*
		 * Equals
		 * 
		 * Método que compara se o objeto é igual a outro, retornando true ou false.
		 */
		System.out.println(a.equals(b)); // false

		/*
		 * HashCode
		 * 
		 * Método que retorna um número inteiro representando um código gerado a partir
		 * das informações do objeto
		 */
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		// true
		String s1 = "Test";
		String s2 = "Test";

		// false
		String s3 = new String("Test");
		String s4 = new String("Test");

		System.out.println();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		// Compara dois OBJETOS por igualdade através do CONTEÚDO dos objetos
		System.out.println(c1.equals(c2));
		// Compara a REFERÊNCIA dos objetos
		System.out.println(c1 == c2);
		System.out.println(s1 == s2); // true
		System.out.println(s3 == s4); // false

	}

}
