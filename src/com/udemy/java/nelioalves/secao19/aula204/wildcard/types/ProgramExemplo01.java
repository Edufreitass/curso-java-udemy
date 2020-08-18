package com.udemy.java.nelioalves.secao19.aula204.wildcard.types;

import java.util.ArrayList;
import java.util.List;

public class ProgramExemplo01 {

	/*
	 * Generics são invariantes
	 * 
	 * List<Object> não é o supertipo de qualquer tipo de lista:
	 * 
	 * List<Object> myObjs = new ArrayList<Object>();
	 * List<Integer> myNumbers= new ArrayList<Integer>();
	 * myObjs = myNumbers; // erro de compilação 
	 * 
	 * 
	 * O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
	 * 
	 * List<?> myObjs = new ArrayList<Object>();
	 * List<Integer> myNumbers = new ArrayList<Integer>();
	 * myObjs = myNumbers;
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers; // erro de compilação
		
		// é diferente de..
		
		Object obj;
		Integer x = 10;
		obj = x;
		
	}

}
