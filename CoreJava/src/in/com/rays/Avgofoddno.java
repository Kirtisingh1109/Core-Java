package in.com.rays;

public class Avgofoddno {
	public static void main(String[] args) {
		int n=10;
		int sum=0;
		int avg;
		int count =0;
		for (int i=1; i <=n; i++) {
			if(i%2!=0) {
				sum=sum+i;
				count ++;
			}
			
		}
		avg = sum/count;
		System.out.println("Avg of sum of all odd nmbers=" + avg);
	}

}
