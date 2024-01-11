package in.com.experiment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matchercode {
	public static void main(String[] args) {
		
		
		        String fullName = "kirtirajput8697@gmail.com";

		        // Define a regular expression to match numbers
		        Pattern pattern = Pattern.compile("\\d+");

		        // Create a Matcher object
		        Matcher matcher = pattern.matcher(fullName);

		        // Find and print numbers in the full name
		        while (matcher.find()) {
		            System.out.println("Number: " + matcher.group());
		        }
		    }
}
