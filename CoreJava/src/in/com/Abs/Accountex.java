package in.com.Abs;

public class Accountex implements Cloneable{
	int balance;
	
	public Accountex (int balance) {
		this.balance=balance;
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
