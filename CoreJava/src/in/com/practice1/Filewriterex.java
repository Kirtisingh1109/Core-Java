package in.com.practice1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Filewriterex {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\new.txt");
		writer.write("Today's class was good");
		writer.write("I enjoyed a lot");
		writer.close();
		System.out.println("Written succesfully!!");
	}

}
