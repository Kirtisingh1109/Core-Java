package in.com.poly;

public class Square extends Shape{
	private int side=0;
	
	public void setside(int side) {
		this.side=side;
	}
	public int getside() {
		return side;
	}
	public double area() {
	int sqArea=side()*side();
	System.out.println("Sqare area="+sqArea);
	return sqArea;
	}
	}

