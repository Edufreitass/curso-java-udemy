package com.udemy.java.nelioalves.secao14.aula129.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.udemy.java.nelioalves.secao14.aula129.entities.ImportedProduct;
import com.udemy.java.nelioalves.secao14.aula129.entities.Product;
import com.udemy.java.nelioalves.secao14.aula129.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");

			System.out.print("Common, used or imported (c/u/i)? ");
			char type = scan.next().charAt(0);

			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();

			System.out.print("Price: ");
			double price = scan.nextDouble();

			if (type == 'c') {
				list.add(new Product(name, price));
			} else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(scan.next());
				list.add(new UsedProduct(name, price, date));
			} else {
				System.out.print("Customs fee: ");
				double customsFee = scan.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		scan.close();
	}

}
