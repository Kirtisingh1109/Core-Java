package in.com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;


public class TestD {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\obj.txt");
		ObjectInputStream out = new ObjectInputStream(file);
		Marksheet m = (Marksheet) out.readObject();
		
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.java);
		System.out.println(m.python);
		System.out.println(m.html);
		System.out.println(m.total);
	}

}
