package in.com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWriteBineryData  {
		public static void main(String[] args) throws Exception {
			FileInputStream in = new FileInputStream("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\Radhey.jpg");
			FileOutputStream out = new FileOutputStream("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\Shyam.txt");
			int ch = in.read();
			while (ch != -1) {
				out.write(ch);
				ch = in.read();
			          
			}
			System.out.println("Data Copy");
		}
}
