package com.udemy.java.nelioalves.secao13.aula113.application;

import java.util.Date;

import com.udemy.java.nelioalves.secao13.aula113.entities.Order;
import com.udemy.java.nelioalves.secao13.aula113.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(os1);
		System.out.println(os2);

	}

}
