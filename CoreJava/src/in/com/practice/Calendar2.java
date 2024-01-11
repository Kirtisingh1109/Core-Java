package in.com.practice;

import java.util.Calendar;
import java.util.Date;

public class Calendar2 {
public static void main(String[] args) {
	Date d = new Date();
	Calendar cal =Calendar.getInstance();
	cal.setTime(d);
	cal.add(Calendar.DATE, 2);
	System.out.println(cal.getTime());
}
}
