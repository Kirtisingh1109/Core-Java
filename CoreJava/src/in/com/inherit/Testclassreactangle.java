package in.com.inherit;

public class Testclassreactangle {
	public static void main(String[] args) {
//		Shape s = new Shape();
//		s.setBorderwidth(100);
//		s.setColor("Red");
//		s.area();
//		
//		
//		Rectangle r = new Rectangle();
//		r.setLength(100);
//		r.setWidth(2);
//		r.area();
		
//		Shape s1 = new Rectangle();
//		Rectangle rect = (Rectangle) s1;
//		rect.setLength(12);
//		rect.setWidth(100);
//		rect.area();
		
		Shape s3 = new Shape();
		s3.area();
		
		Triangle t = new Triangle();
		t.setBase(12);
		t.setheight(10);
		t.area();
		
		Shape s4 = new Triangle();
		Triangle tri = (Triangle) s4;
		tri.setBase(15);
		tri.setheight(3);
		tri.area();
		
		Shape s5 = new Shape();
		s5.area();
		
		Circle C=new Circle();
		C.setRadius(10);
		C.area();
		
		Shape s6=new Circle();
		Circle Cir=(Circle) s6;
		Cir.setRadius(5);
		Cir.area();
		
		
		
	}

}
