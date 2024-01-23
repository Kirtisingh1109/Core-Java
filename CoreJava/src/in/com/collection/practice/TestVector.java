package in.com.collection.practice;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Kirti");
		v.add("Radhey");
		v.add(1100);
		v.add(2000);
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		v.add(1109);
		v.add("Vanu");
		System.out.println(v);
		
		while (e.hasMoreElements()) {
			 System.out.println(e.nextElement());
		//	Enumeration is used to seprate elements and show them in next line.//
		}
	}

}
