package com.udemy.java.nelioalves.secao14.aula131.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.udemy.java.nelioalves.secao14.aula131.entities.Circle;
import com.udemy.java.nelioalves.secao14.aula131.entities.Rectangle;
import com.udemy.java.nelioalves.secao14.aula131.entities.Shape;
import com.udemy.java.nelioalves.secao14.aula131.entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");

			System.out.print("Rectangle or circle (r/c)? ");
			char ch = scan.next().charAt(0);

			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scan.next());

			if (ch == 'r') {
				System.out.print("Width: ");
				double width = scan.nextDouble();

				System.out.print("Height: ");
				double height = scan.nextDouble();

				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = scan.nextDouble();

				list.add(new Circle(color, radius));
			}
		}

		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		scan.close();
	}

}
