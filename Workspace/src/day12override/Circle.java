package day12override;

public class Circle extends Shape{
	public Circle(double radius) {
		this.setRadius(radius);
	}

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius >=0 ? radius :0;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Area=" + getArea() + "]";
	}
	
}
