package in.com.practice;

import java.util.Calendar;
import java.util.Date;

public class Calendar3 {
public static void main(String[] args) {
	Date d = new Date();
	Calendar cal = Calendar.getInstance();
	cal.getTime();
	cal.add(Calendar.DATE, 3);
	System.out.println(cal.getTime());
	}
}
