package in.com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Testemployee {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList();
		emp.add(new Employee(1, "Kirti", "67890"));
		emp.add(new Employee(4, "Shivan sir", "23456"));
		emp.add(new Employee(6, "Rays", "12345"));
		emp.add(new Employee(7, "Java", "23467"));
		emp.add(new Employee(2, "Tilu", "6789"));
		emp.add(new Employee(9, "Logic", "123456"));
		emp.add(new Employee(5, "String" , "45678"));
		
//		System.out.println(emp);
//		
//		Collections.sort(emp, new Comparatorbyid());
//		System.out.println(emp);
		
//		ArrayList<Employee>emp1 = new ArrayList(emp);
//		Collections.sort(emp1 , new Comparatorbyname());
//		System.out.println(emp1);
		
		ArrayList<Employee>emp2 = new ArrayList<Employee>(emp);
		Collections.sort(emp2, new Comparatorbyphone());
		System.out.println(emp2);
		
	}
	

}
