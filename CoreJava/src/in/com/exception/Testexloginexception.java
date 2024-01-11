package in.com.exception;

public class Testexloginexception {
	public static void main(String[] args) {
		
	
	String name="Kirti";
	if(name.contentEquals("kirt")) {
		System.out.println("Yes valid user!!");
	}
	else {
		exloginexception e = new exloginexception();
		try {
			throw e ;
		} catch (exloginexception e2) {
			System.out.println(e2);
		}
	}
	
	}
}
