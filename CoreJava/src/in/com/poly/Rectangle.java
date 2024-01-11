package in.com.poly;

public class Rectangle extends Shape{
	private int Length=0;
	private int Width=0;
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	
	public double area() {
		int rArea=getLength()*getWidth();
		System.out.println("Rectangle Area="+rArea);
		return rArea;
	}

}
