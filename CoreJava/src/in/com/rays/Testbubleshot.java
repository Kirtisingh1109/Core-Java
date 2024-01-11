package in.com.rays;

public class Testbubleshot {
	public static void main(String[] args) {
		int [] arr = {233,400,546,12,67,54,90,1};
		int temp =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
				}
				
			}
			System.out.println(arr[i]);
		}
		
	}

}
