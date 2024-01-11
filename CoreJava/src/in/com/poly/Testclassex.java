package in.com.poly;

public class Testclassex {
	public static void main(String[] args) {
	
	Shape []s=new Shape[4];
	s[0]=new Rectangle();
	s[1]=new Circle();
	s[2]=new Triangle();
	s[3]=new Square();
	
	Rectangle r=(Rectangle) s[0];
	r.setLength(100);
	r.setWidth(5);
	r.area();
	
	Circle c=(Circle) s[1];
	c.setRadius(3);
	c.area();
	
	Triangle t=(Triangle) s[2];
	t.setBase(30);
	t.setHeight(5);
	t.area();
	
	Square sq=
	
	double totalArea=0;
	for (int i = 0; i < s.length; i++) {
		totalArea=totalArea+s[i].area();
		
			}
	System.out.println("Total Area="+totalArea);
	
}
}
