package in.com.practice;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DATETOSIMPLEEX {
	public static void main(String[] args) throws  Exception{
		String s="29/12/23";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Date d = sdf.parse(s);
		System.out.println(d);
	}

}
