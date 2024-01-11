package in.com.exception;

public class Testexeption3 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		String name = "Rays";
		try {
			int c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(name.charAt(5));
		} catch (Exception e) {
			System.out.println(e);

		}
		finally {
			System.out.println("y to chalega hi chalega exception ho ya na ho");
		}
	}

}
