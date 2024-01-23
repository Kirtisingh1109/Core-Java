package in.com.io;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\experiance.txt");
		writer.write("Hey i m kirti");
		writer.write("I m glad to share my Experiance");
		writer.close();
		System.out.println("Data write succesfully");
	}

}
