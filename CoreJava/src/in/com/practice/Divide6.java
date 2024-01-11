package in.com.practice;

public class Divide6 {
public static void main(String[] args) {
	int a=6;
	int count=0;
	int sum=0;
	for (int i = 1; i <=100; i++) {
		if(i%6==0) {
			count = i;
			System.out.println(count);
			sum = sum + count;
		}
		
	}
	System.out.println("tha sum of all ="+sum);
}
}
