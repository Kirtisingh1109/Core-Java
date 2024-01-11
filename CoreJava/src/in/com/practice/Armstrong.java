package in.com.practice;

public class Armstrong {
	public static void main(String[] args) {
		int a=123;
		int b=0;
		int c;
		int d=a;
		 while (d>0)
		 {
			 c=d%10;
			 b=b+(c*c*c);
			 d=d/10;
		 }
		 if (b==a){
			 System.out.println("its a armstrong no");
		 }else {
			 System.out.println("its not a armstrong");
		 }
	}

}
