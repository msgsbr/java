package entities;

import entities.enums.Color;

public abstract class AbstractMethodShape {

	private Color color;
	
	public AbstractMethodShape() {
	}
	
	public AbstractMethodShape(Color color) {
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