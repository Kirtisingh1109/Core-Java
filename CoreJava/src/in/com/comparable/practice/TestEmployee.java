package in.com.comparable.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> e1 = new ArrayList();
		e1.add(new Employee(2, "Kirti", "jaipur"));
		e1.add(new Employee(8, "Akku", "Rajgarh"));
		e1.add(new Employee(4, "Rachu", "Mandav"));
		e1.add(new Employee(0, "Rudra", "Jhirvi"));
		e1.add(new Employee(1, "Giri Anna", "Dhar"));
			System.out.println(e1);
			 
			 Collections.sort(e1);//It gives the value in accending order sequence wise//
			 System.out.println(e1);
	}

}
