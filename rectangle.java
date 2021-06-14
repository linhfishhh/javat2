package hinhhoc;

public class rectangle extends shape {
	private double width=1.0;
	private double length=1.0;
	public rectangle() {}
	public rectangle(double width, double length) {
		this.width=width;
		this.length=length;
	}
	public rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width=width;
		this.length=length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return this.width*this.length;
	}
	public double getPerimeter() {
		return 2*(this.width+this.length);
	}
	public String toString() {
		return "A Rectangle with width = "+getWidth()+" and length="+getLength()+", which is a subclass of"+super.toString();
	}
}
