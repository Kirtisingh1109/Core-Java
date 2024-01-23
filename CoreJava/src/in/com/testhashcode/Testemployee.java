package in.com.testhashcode;

public class Testemployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Rays", "Indore");
		Employee e2 = new Employee(1, "Rays", "Indore");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
