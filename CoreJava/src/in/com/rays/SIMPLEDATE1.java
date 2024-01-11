package in.com.rays;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SIMPLEDATE1 {
public static void main(String[] args) {
	Date d = new Date();
//	System.out.println(d);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	String s = sdf.format(d);
	System.out.println(s);
}
}
