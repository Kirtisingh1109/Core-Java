package in.com.exception;

public class Testexeception {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println("dicision of c="+c);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
