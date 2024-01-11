package in.com.collection;

import java.util.ArrayList;
import java.util.List;

public class Testlist {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Kirti");
		list.add(8);
		list.add("Rays");
		list.add(10.6);
		
		System.out.println(list);
		System.out.println("get="+list.get(0));
		System.out.println("get="+list.get(1));
		System.out.println("Index="+list.indexOf("Kirti"));
		System.out.println("Index="+list.indexOf(10.6));
		System.out.println("last index of="+list.lastIndexOf("Kirti"));
		System.out.println("sub list="+list.subList(0,3));
		
		
	}

}
