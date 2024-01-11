package in.com.deepcloning;

public class TestCust {
public static void main(String[] args) throws Exception {
	Customer c1 = new Customer("virat", 10000);
	Customer c2 = (Customer) c1.clone();
	
	c2.name = "Dhoni";
	c2.a.balance = 90000;
	
	
	System.out.println(c1.name);
	System.out.println(c1.a.balance);
	
	
	System.out.println(c2.name);
	System.out.println(c2.a.balance);
}
}
