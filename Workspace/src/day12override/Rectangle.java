package day12override;



public class Rectangle extends Shape{
	public Rectangle(double length, double height) {
		setLength(length);
		setHeight(height);
	}
	private double length;
	private double height;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length >=0 ?length :0;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height >=0 ?height :0;
	}
	@Override
	public double getArea() {
		
		return getLength()*getHeight();
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", height=" + height + ", Area=" + getArea() + "]";
	}
	
}