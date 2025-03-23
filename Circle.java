public class Circle {
	
	//***CLASS PROPERTIES***
	private double radius = 1.0;
	private String color = "red";
	
	//***CLASS BEHAVIOURS***
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return radius * radius * 3.14159; //used pi approximation since high accuracy wasn't required according to lab documentation
	}
	
	public String toString() {
		return "Circle Properties: [  Color: " + this.color + ", Radius: " + this.radius + ", Area: " + this.getArea +"]";
	}
}