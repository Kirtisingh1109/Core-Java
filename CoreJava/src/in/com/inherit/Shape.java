package in.com.inherit;

public class Shape {
	private String color = null;
	private int Borderwidth=0;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public int getBorderwidth() {
		return Borderwidth;
	}
	public void setBorderwidth(int Borderwidth) {
		this.Borderwidth=Borderwidth;
	}
	public double area() {
		System.out.println("Shape area method");
		return 0;
	}

}
