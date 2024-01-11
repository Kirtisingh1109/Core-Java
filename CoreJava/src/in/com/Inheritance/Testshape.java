package in.com.Inheritance;

public class Testshape {
	public static void main(String[] args) {
	//	Shape s = new Shape();
	//	s.area();
		
		
		Rectangle r = new Rectangle ();
		r.setLength(12);
		r.setWidth(10);
	//	r.area();
		
		Shape s1 =new Rectangle();
		s1.area();
	//	r.setLength(10);
	//	r.setWidth(5);
		r.area();
		
		Rectangle rect = (Rectangle) s1;
		rect.setLength(40);
		rect.setWidth(5);
		rect.area();
		r.area();
		s.area();
		
		
	}

}
