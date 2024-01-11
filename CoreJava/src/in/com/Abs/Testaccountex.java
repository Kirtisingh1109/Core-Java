package in.com.Abs;



public class Testaccountex {
	public static void main(String[] args) throws Exception {
	
	
	Accountex a = new Accountex (100);
	Accountex a2=(Accountex) a.clone();
	
	a2.balance=151;
	
	System.out.println(a.balance);
	System.out.println(a2.balance);
	
	
	
	}
}
