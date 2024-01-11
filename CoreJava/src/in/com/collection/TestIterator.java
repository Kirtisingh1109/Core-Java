package in.com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		
	
	List list = new ArrayList();
	list.add("Rays");
	list.add("Java");
	list.add("Kirti");
	list.add(12);
	list.add(8.9);
	
	//System.out.println(list);
	
//	for (int i = 0; i < list.size(); i++) {
	//	System.out.println(list.get(i));
		
//	}
//	 for (Object object : list) {
//		 System.out.println(object);
//		
//	}
	 Iterator it = list.iterator();
	 while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	 

}
}
