package in.com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Teststream {
	public static void main(String[] args) {
		List<Integer> L1 = new ArrayList<Integer>();
		L1.add(100);
		L1.add(200);
		L1.add(400);
		L1.add(123);
		L1.add(345);
		L1.add(45);
		L1.add(1109);
		
		System.out.println(L1);
		
		List<Integer> Listeven = new ArrayList<Integer>();
//	for (Integer i : L1) {
//		if (i%2==0) {
//			Listeven.add(i);
//			
//		}
//		
//	}
//	    System.out.println(L1);
//	    System.out.println(Listeven);
//	    
//	    Stream<Integer> stream = L1.stream();
//	    List<Integer> newlist = stream.filter(i -> i%2==1).collect(Collectors.toList());
//	    System.out.println(newlist);
//	   
//		List<Integer>newlist = L1.stream().filter(i -> i%2==0).collect(Collectors.toList());
//		System.out.println(newlist);
//	    
		
//		List<Integer>newlist = L1.stream().filter(i-> i > 50).collect(Collectors.toList());
//		System.out.println(newlist);
//		
		List<Integer>newlist = L1.stream().filter(i-> i<50).collect(Collectors.toList());
		System.out.println(newlist);
	}
	

}
