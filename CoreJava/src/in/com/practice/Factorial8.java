package in.com.practice;

public class Factorial8 {
public static void main(String[] args) {
	int a=1;
	int b=1;
	while(a<=8) {
		b=a * b;
		a++;
	}
	System.out.println("Factorial of 8 ="+b);
}
}
