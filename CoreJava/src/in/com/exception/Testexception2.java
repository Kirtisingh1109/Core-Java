package in.com.exception;

public class Testexception2 {
	public static void main(String[] args) {
		//String name=null;
		String name="KIRTI";
		try {
			System.out.println(name.charAt(8));
		} catch (Exception e) {
			System.out.println(e);
		}
		
//		try {
//			System.out.println(name.length());
//		} catch (Exception e) {
//			System.out.println(e);
//		}
	
	}

}
