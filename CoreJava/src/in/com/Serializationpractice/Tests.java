package in.com.Serializationpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Tests {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\obj1.txt");
		ObjectOutput out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();
		m.id = 1;
		m.name = "Shivam Sir";
		m.java = 20;
		m.python = 100;
		m.html = 120;
		m.total = m.java + m.python + m.html;
		
		out.writeObject(m);
		file.close();
		out.close();
		System.out.println("OBJ converted into bytestream Sucessfully!!");
			
	}

}
