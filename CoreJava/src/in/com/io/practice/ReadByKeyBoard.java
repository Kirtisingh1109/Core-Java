package in.com.io.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyBoard {
	public static void main(String[] args) throws Exception {
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);
		PrintWriter out = new PrintWriter("C:\\Users\\Fluke Account\\Desktop\\KirtiIO\\newline.txt");
	    String Line = in.readLine();
	     while (!(Line.equals("BYE"))) {
	    	out.println(Line);
	    	Line = in.readLine();
			
		}
	     in.close();
	     out.close();
	     isReader.close();
		}
		
	
}


