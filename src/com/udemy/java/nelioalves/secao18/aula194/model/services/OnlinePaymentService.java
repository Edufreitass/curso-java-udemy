package com.udemy.java.nelioalves.secao18.aula194.model.services;

public interface OnlinePaymentService {

	// taxa de pagamento
	double paymentFee(double amount);

	// juros
	double interest(double amount, int months);

}
