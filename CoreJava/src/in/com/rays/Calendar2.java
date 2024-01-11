package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
    
public class Calendar2 {
public static void main(String[] args) throws Exception {
	String s="01/01/2023";
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	Date d =sdf.parse(s);
	Calendar cal = Calendar.getInstance();
	cal.setTime(d);
	cal.add(Calendar.DATE, 14);
	System.out.println(cal.getTime());
	
}
}
