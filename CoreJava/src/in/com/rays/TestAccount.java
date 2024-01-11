package in.com.rays;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.setnumber(12584);
		a.setAccounttype("Saving");
		a.setBalance(8567);
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccounttype());
		System.out.println(a.getBalance());
		
		
	}
}
