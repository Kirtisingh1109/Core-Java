package in.com.collection;

import java.util.HashSet;
import java.util.Set;

public class Testset {
	public static void main(String[] args) {
		Set s1 = new HashSet();
		s1.add(1);
		s1.add("one");
		s1.add("neeraj");
		s1.add(1);
		s1.add(null);
		s1.add("rays");
		s1.add("rays");
		
		System.out.println(s1);
	}

}
