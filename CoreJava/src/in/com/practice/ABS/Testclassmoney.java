package in.com.practice.ABS;

public class Testclassmoney {
	public static void main(String[] args) {
		Money m = new Money(100);
		Money m2 = m;
		
	    m2.balance=200;
	    System.out.println(m.balance);
	    System.out.println(m2.balance);
	    
	}

}
