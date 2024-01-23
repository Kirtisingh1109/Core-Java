package in.com.practice1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Scannerex {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\enjoy.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
