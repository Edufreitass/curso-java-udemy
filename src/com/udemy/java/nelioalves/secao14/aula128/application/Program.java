package com.udemy.java.nelioalves.secao14.aula128.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.udemy.java.nelioalves.secao14.aula128.entities.Employee;
import com.udemy.java.nelioalves.secao14.aula128.entities.OutsourceEmployee;

public class Program {

	/*
	 * Uma empresa possui funcionários próprios e terceirizados. Para cada
	 * funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
	 * Funcionários terceirizado possuem ainda uma despesa adicional. O pagamento
	 * dos funcionários corresponde ao valor da hora multiplicado pelas horas
	 * trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus
	 * correspondente a 110% de sua despesa adicional. Fazer um programa para ler os
	 * dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma
	 * lista. Depois de ler todos os dados, mostrar nome e pagamento de cada
	 * funcionário na mesma ordem em que foram digitados.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");

			System.out.print("Outsourced (y/n)? ");
			char ch = scan.next().charAt(0);

			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();

			System.out.print("Hours: ");
			int hours = scan.nextInt();

			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();

			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = scan.nextDouble();
//				Employee emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
//				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(new Employee(name, hours, valuePerHour));
			}

		}

		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		scan.close();
	}

}
