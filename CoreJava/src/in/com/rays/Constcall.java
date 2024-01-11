package in.com.rays;

public class Constcall {
	String Fname = null;
	String Lname = null;
	String Address = null;
	
	public Constcall () {
		System.out.println("Default");
	}
	public Constcall(String fn , String ln) {
		Fname=fn;
		Lname=ln;
		System.out.println("Two Param");
		
	}
	public Constcall(String fn, String ln , String ad) {
		Fname = fn;
		Lname = ln;
		Address = ad;
		System.out.println("Three Param");
	}

}
