package in.com.poly;

public class Circle extends Shape{
	private int radius=0;
	private double PI=3.14;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		double cArea=PI*getRadius()*getRadius();
		System.out.println("Circle area="+cArea);
		return cArea;
	}

}
