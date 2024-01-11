package in.com.rays;

public class Testclassshape {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setcolor("Orange");
		s.setborderwidth(5);
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
	}

}
