package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DATETOSIMPLE {
public static void main(String[] args) throws Exception {
	String s = "19/12/2023";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d = sdf.parse(s);
	System.out.println(d);
}
}
