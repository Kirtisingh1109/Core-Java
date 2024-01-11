package in.com.exception;

public class Testloginexception {
	public static void main(String[] args) {
		String name = "Kirti";
		if(name.contentEquals("Kirt")) {
			System.out.println("Yes valid user!!");
		}
		else {
			Loginexeception e = new Loginexeception();
			try {
				throw e;
			} catch (Loginexeception e2) {
				System.out.println(e2);
			}
		}
	}

}
