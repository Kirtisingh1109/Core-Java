package in.com.rays;

public class Testconstcall {
	public static void main(String[] args) {
	Constcall c = new Constcall();
	
	Constcall c1 = new Constcall("Kirti","Singh");
	
	Constcall c2 = new Constcall("Kirti","Singh","Indore");
	
	System.out.println("c:"+c.Fname +","+c.Lname +","+c.Address);
	System.out.println("c1:"+c1.Fname +","+c1.Lname+","+c1.Address);
	System.out.println("c2:"+c2.Fname+","+c2.Lname+","+c2.Address);
	}
}
