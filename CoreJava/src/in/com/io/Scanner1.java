package in.com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\Radhey.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		sc.close();
	}

}
