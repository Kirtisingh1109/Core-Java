package in.com.inherit;

public class Rectangle extends Shape{
	private int Length;
	private int Width;
	
	public void setLength(int Length) {
		this.Length=Length;
	}
	public int getLength() {
		return Length;
	}
	public void setWidth(int Width) {
		this.Width=Width;
	}
	public int getWidth() {
		return Width;
	}
	public double area() {
		int rArea = getLength() * getWidth();
		System.out.println("Rectangle Area="+rArea);
		return rArea;
	}

}
