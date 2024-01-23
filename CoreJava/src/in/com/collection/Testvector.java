package in.com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Testvector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(100);
		v.add(101);
		v.add("Kirti");
		System.out.println(v);
		
		Enumeration e = v.elements();
		v.add(1109);
		v.add("vanu");
		
		System.out.println(v);
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
	}

}
