package in.com.deepcloning;

public class Star implements Cloneable{
	String name=null;
	
	Balance b = new Balance();
	
	public Star(String name , int money) {
		this.b.money=money;
		this.name=name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Star s=(Star) super.clone();
		s.b=(Balance) b.clone();
		return (s);
	}

}
