package in.com.collection.practice;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Dham");
		list.add("Shree");
		list.add("Radhey");
		list.add("Shayama");
		list.add("Vrindavan");
		list.add("Dham");
		
		System.out.println(list);
		System.out.println("get 0="+list.get(0));
		System.out.println("get 4="+list.get(4));
		System.out.println("Index="+list.indexOf("Radhey"));
		System.out.println("Last Index="+list.lastIndexOf("Dham"));
		System.out.println("Index = "+ list.indexOf("Dham"));
		System.out.println("Sub List = "+ list.subList(0, 6));
	}

}
