package in.com.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter1 {
	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\enjoy.txt");
		PrintWriter out = new PrintWriter(file);
		out.println("My self Kirti");
		out.println("I am lucky to have a great teacher like Shivam Sir");
		out.println("Its his hard work so i m able to code");
		file.close();
		out.close();
		System.out.println(" Data written Succesfully!!!");
	}

}
