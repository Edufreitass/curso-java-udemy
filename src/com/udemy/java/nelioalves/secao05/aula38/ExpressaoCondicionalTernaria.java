package com.udemy.java.nelioalves.secao05.aula38;

public class ExpressaoCondicionalTernaria {

	/*
	 * Expressão Condicional Ternária
	 * 
	 * Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
	 * condição.
	 * 
	 * Sintaxe:
	 * 
	 * ( condição ) ? valor_se_verdadeiro : valor_se_falso
	 * 
	 * Exemplos:
	 * 
	 * ( 2 > 4 ) ? 50 : 80					Resultado: 80
	 * 
	 * ( 10 != 3 ) ? "Maria" : "Alex"		Resultado: "Maria"
	 * 
	 */
	
	public static void main(String[] args) {

		/*
		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		*/
		
		// forma simplificada
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("Desconto R$ %.2f%n", desconto);
		
	}

}
