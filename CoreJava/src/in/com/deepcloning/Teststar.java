package in.com.deepcloning;

public class Teststar {
	public static void main(String[] args) throws Exception {
		Star s1= new Star("Amitabh",100000);
		Star s2= (Star) s1.clone();
		
		s2.b.money=5000;
		s2.name="Rajesh";
		
		System.out.println(s1.name);
		System.out.println(s1.b.money);
		
		System.out.println(s2.name);
		System.out.println(s2.b.money);
	}

}
