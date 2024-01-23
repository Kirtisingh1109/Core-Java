package in.com.collection.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TestItrator {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Radhey");
		list.add("Kirti");
		list.add("Jaipur");
		list.add(11);
		
		System.out.println(list);
		//Multiple method  is used to perform this in this output would be same but methods are different Size , Object , println//
		
		
    	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
		
	    for (Object object : list) {
		System.out.println(object);
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			//Iterator is used to put vales in next line //
					
		}
		
			}
   	}
	}
}

