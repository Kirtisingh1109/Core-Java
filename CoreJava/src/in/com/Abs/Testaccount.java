package in.com.Abs;

public class Testaccount {
	public static void main(String[] args) throws Exception {
		Account a= new Account (101);
		Account a2=(Account) a.clone();
		
		a2.balance = 2000;
		
		System.out.println(a.balance);
		System.out.println(a2.balance);
	}

}
