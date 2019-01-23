package entities;

import entities.enums.Color;

public class AbstractMethodCircle extends AbstractMethodShape {

	private Double radius;
	
	public AbstractMethodCircle() {
		super();
	}
	
	public AbstractMethodCircle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}