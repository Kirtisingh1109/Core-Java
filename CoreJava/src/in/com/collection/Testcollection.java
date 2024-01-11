package in.com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Testcollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(1);
		c.add(2);
		c.add("Kirti");
		c.add(10.4);
		System.out.println(c);
		
		Collection c1 = new ArrayList();
		c1.add(2);
		c1.add("Rays");
		c1.add("JAVA");
		c1.add(9.7);
		//System.out.println(c1);
		
	//c.clear();
//		System.out.println(c);
		
		//System.out.println(c.contains("Kirti"));
		//System.out.println(c.isEmpty());
		//c.remove("Kirti");
		//System.out.println(c);
		c.retainAll(c);
		System.out.println(c);
		c.size();
		System.out.println(c);
	}

}
