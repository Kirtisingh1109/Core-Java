package in.com.inherit;

public class Circle extends Shape{
	private int radius =0;
	private double PI=3.14;
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public double area () {
		double CArea=PI* getRadius()*getRadius();
		System.out.println("Circle Area="+CArea);
		return CArea;
	}
	}
