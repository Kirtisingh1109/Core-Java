package in.com.collection.practice;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "Kirti");
		map.put(2, "Tilu");
		map.put(3, "Chiki");
		map.put(4, "Rudra");
		map.put(5, "Rachu");
		map.put(6, "Akku");
		map.put(7, "DADA");
		
		System.out.println(map);//put all values in one line//
		System.out.println(map.get(1));//to find out that what values is in 1st index//
		System.out.println(map.get(5));
		System.out.println(map.keySet());//to find how many key set are there like total no of keys//
		System.out.println(map.values());// to find out the vales or name we put in this class//
		System.out.println(map.size());//to find out total no of index value like in this total size of program is "7"?//
		
	}

}
