package com.udemy.java.nelioalves.secao18.aula196.v2.model.entities;

import com.udemy.java.nelioalves.secao18.aula196.v2.model.enums.Color;

public abstract class AbstractShape implements Shape {

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
