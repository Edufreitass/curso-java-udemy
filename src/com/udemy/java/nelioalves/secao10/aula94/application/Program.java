package com.udemy.java.nelioalves.secao10.aula94.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.udemy.java.nelioalves.secao10.aula94.entities.Employee;

public class Program {

	// Correção: https://youtu.be/Xj-osdBe3TE
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = scan.nextInt();
			
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = scan.nextInt();
			}

			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			
			System.out.print("Salary: ");
			Double salary = scan.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idsalary = scan.nextInt();

		// Integer pos = position(list, idsalary);

		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

		// if (pos == null) {
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = scan.nextDouble();
			// list.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee e : list) {
			System.out.println(e);
		}

		scan.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
