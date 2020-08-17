package com.udemy.java.nelioalves.secao18.aula194.model.services;

import java.util.Calendar;
import java.util.Date;

import com.udemy.java.nelioalves.secao18.aula194.model.entities.Contract;
import com.udemy.java.nelioalves.secao18.aula194.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	// injetando a dependencia do OnlinePaymentService através do construtor
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		// basicQuota = 200
		for (int i = 1; i <= months; i++) {
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			// updatedQuota = 202
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			// fullQuota = 206.04
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}

	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}

}
