package in.com.Abs;

public class Teastclassmoney {
	public static void main(String[] args) throws Exception {
		Money m= new Money(100);
		Money m2 = (Money) m.clone();
				m2.balance=200;
		 
		 System.out.println(m.balance);
		 System.out.println(m2.balance);
		 
	}

}
