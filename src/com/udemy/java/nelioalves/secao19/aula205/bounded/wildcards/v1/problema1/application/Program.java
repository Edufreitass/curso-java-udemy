package com.udemy.java.nelioalves.secao19.aula205.bounded.wildcards.v1.problema1.application;

import java.util.ArrayList;
import java.util.List;

import com.udemy.java.nelioalves.secao19.aula205.bounded.wildcards.v1.problema1.entities.Circle;
import com.udemy.java.nelioalves.secao19.aula205.bounded.wildcards.v1.problema1.entities.Rectangle;
import com.udemy.java.nelioalves.secao19.aula205.bounded.wildcards.v1.problema1.entities.Shape;

public class Program {

	/*
	 * Problema 1
	 * 
	 * Vamos fazer um método para retornar a soma das áreas de uma lista de figuras.
	 */
	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	// Lista com tipo curinga delimitado
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
