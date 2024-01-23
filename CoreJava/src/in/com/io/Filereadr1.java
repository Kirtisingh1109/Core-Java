package in.com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filereadr1 {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\radhey.txt");
		int ch = reader.read();
		while (ch != -1) {
			System.out.print((char)ch);
			ch = reader.read();
			
		}
		reader.close();
	}

}
