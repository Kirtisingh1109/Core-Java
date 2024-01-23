package in.com.practice1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriterex {
	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\Radhey.txt");
		PrintWriter out = new PrintWriter(file);
		out.println("Radhey Shyam");
		out.println("Shyama Shyam");
		out.println("Shree Radhey");
		file.close();
		out.close();
		System.out.println("Text write succesfully!!");
	}

}
