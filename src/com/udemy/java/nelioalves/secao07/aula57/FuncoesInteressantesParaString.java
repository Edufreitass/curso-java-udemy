package com.udemy.java.nelioalves.secao07.aula57;

public class FuncoesInteressantesParaString {

	/*
	 * Checklist
	 * 
	 * FORMATAR: toLowerCase(), toUpperCase(), trim(remove_espacos)
	 * 
	 * RECORTAR: substring(inicio), substring(inicio, fim)
	 * 
	 * SUBSTITUIR: Replace(char, char), Replace(string, string)
	 * 
	 * BUSCAR: IndexOf, LastIndexOf
	 * 
	 * RECORTAR COM BASE NO SEPARADOR: str.Split("separador")
	 */

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG		";
		System.out.println("Original: -" + original + "-");

		String s1 = original.toLowerCase();
		System.out.println("toLowerCase: -" + s1 + "-");

		String s2 = original.toUpperCase();
		System.out.println("toUpperCase: -" + s2 + "-");

		String s3 = original.trim();
		System.out.println("trim: -" + s3 + "-");

		String s4 = original.substring(2);
		System.out.println("substring(2): -" + s4 + "-");

		String s5 = original.substring(2, 9);
		System.out.println("substring(2, 9): -" + s5 + "-");

		String s6 = original.replace('a', 'x');
		System.out.println("replace('a', 'x'): -" + s6 + "-");

		String s7 = original.replace("abc", "xy");
		System.out.println("replace('abc', 'xy'): -" + s7 + "-");

		int i = original.indexOf("bc");
		System.out.println("indexOf('bc'): " + i);

		int j = original.lastIndexOf("bc");
		System.out.println("lastIndexOf('bc'): " + j);

	}

}
