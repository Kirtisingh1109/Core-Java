package in.com.practice;

public class Factorial {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		while(a<=7) {
			b=a * b;
			a++;
		}
		System.out.println("Factorial of 7="+b);
	}

}
