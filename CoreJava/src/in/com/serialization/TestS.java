package in.com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestS {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\obj.txt");
		ObjectOutput out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();
		m.id = 1;
		m.name= "Kirti";
		m.java = 90;
		m.python = 101;
		m.html = 10;
		m.total = m.java + m.python + m.html;
		
		out.writeObject(m);
		file.close();
		out.close();
		System.out.println("obj converted into Bytestream Sucessfully");
	}

}
