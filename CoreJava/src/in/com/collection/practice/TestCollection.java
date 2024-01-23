package in.com.collection.practice;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(1);
		c.add(2);
		c.add("Radhey");
		c.add("Shyam");
		c.add(10.87);
		
		System.out.println(c);
		
		Collection c1 = new ArrayList();
		c1.add(1.1);
		c1.add(3);
		c1.add("Vanu");
		c1.add("Kirti");
		
		System.out.println(c1);
		
		c.clear();//This is used to clear all the data of respective class //
		System.out.println(c);
		System.out.println(c1.contains("Kirti"));//it gives the statement the the given value is in the class or not it checks and give respective answers accordingly like True or false // 
		System.out.println(c.isEmpty());//same like above statment give true or false according to entries// 
		c1.remove("Kirti");// helps  to remove dada from the perticular class or collection and give rest of the values//
		System.out.println(c1);
		c.retainAll(c);
		System.out.println(c);//give out put of all collections//
		c.size();
		System.out.println(c);// sed to give size of perticular collection//
	}

}
