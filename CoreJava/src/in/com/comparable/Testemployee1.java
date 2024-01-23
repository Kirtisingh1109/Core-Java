package in.com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Testemployee1 {
	public static void main(String[] args) {
		ArrayList<Employee1> e = new ArrayList();
		e.add(new Employee1(1, "Kirti", "4567"));
		e.add(new Employee1(10 ,"Rays", "2345"));
		e.add(new Employee1(3, "Shivam Sir", "1234"));
		e.add(new Employee1(6, "tilu" , "2341"));
		
		System.out.println(e);
		Collections.sort(e);
		System.out.println(e);
		
		
		
		
	}

}
