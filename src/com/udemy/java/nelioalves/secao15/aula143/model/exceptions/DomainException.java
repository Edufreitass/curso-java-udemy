package com.udemy.java.nelioalves.secao15.aula143.model.exceptions;

public class DomainException extends RuntimeException {

	// Exception: é um tipo de exceção que o compilador OBRIGA a tratar.
	// RuntimeException: é um tipo de exceção que o compilador NÃO obriga a tratar

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}

}
