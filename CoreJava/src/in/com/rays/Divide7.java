package in.com.rays;

public class Divide7 {
	public static void main(String[] args) {
		int a=7;
		int count=0;
		int sum =0;
		for (int i = 100; i <=200; i++) {
			if(i%7==0) {
				count=i;
				System.out.println(count);
				sum=sum +count;
			}
			
		}
		System.out.println("The sum is ="+sum);
	}

}
