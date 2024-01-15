package in.com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Testemployee {
	public static void main(String[] args) {
		ArrayList<Employee> e1 = new ArrayList();
		e1.add(new Employee(1, "Kirti", "1234"));
		e1.add(new Employee(9, "Aryan", "2345"));
		e1.add(new Employee(4, "Rays", "2345"));
		e1.add(new Employee(2, "Java", "1256"));
		e1.add(new Employee(8, "Tilu", "2896"));
		
		System.out.println(e1);
	
		Collections.sort(e1);
		System.out.println(e1);
	}
                      
}
