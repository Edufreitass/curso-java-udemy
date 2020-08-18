package com.udemy.java.nelioalves.secao19.aula204.wildcard.types;

import java.util.ArrayList;
import java.util.List;

public class ProgramExemplo03 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<?> list = new ArrayList<Integer>();

		// não é possível adicionar dados a uma coleção de tipo curinga
		
//		list.add(3); // erro de compilação
		
		// O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.
	}

}
