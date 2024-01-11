package in.com.Abs;

public class Money implements Cloneable{
	  int balance;
	
	public Money(int balance) {
		this.balance=balance;
	} 
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
