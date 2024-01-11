package in.com.poly;

public class Shape {
	private String color=null;
	private int borderwidth=0;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	
	public double area() {
		System.out.println("Shape area method");
		return 0;
	}

}
