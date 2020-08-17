package com.udemy.java.nelioalves.secao18.aula196.v1.model.entities;

import com.udemy.java.nelioalves.secao18.aula196.v1.model.enums.Color;

public abstract class Shape {

	private Color color;

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();

}
