package com.udemy.java.nelioalves.secao18.aula196.v1.application;

import com.udemy.java.nelioalves.secao18.aula196.v1.model.entities.Circle;
import com.udemy.java.nelioalves.secao18.aula196.v1.model.entities.Rectangle;
import com.udemy.java.nelioalves.secao18.aula196.v1.model.entities.Shape;
import com.udemy.java.nelioalves.secao18.aula196.v1.model.enums.Color;

public class Program {

	public static void main(String[] args) {

		Shape s1 = new Circle(Color.BLACK, 2.0);
		Shape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

	}

}
