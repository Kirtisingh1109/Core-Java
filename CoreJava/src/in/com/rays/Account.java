package in.com.rays;

public class Account {
	private int number = 0;
	private String Accounttype = null;
	private int Balance = 0;
	
	public void setnumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setAccounttype(String Accounttype) {
		this.Accounttype = Accounttype;
	}
	public String getAccounttype() {
		return Accounttype;
	}
	public void setBalance(int Balance) {
		this.Balance = Balance;
	}
	public int getBalance() {
		return Balance;
	}
	
	

}
