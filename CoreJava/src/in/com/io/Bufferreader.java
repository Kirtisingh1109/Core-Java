package in.com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Bufferreader {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\radhey.txt");
		BufferedReader reader = new BufferedReader(file);
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
			
		}
		reader.close();
		file.close();
	}

}
