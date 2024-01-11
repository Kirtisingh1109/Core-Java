package in.com.collection;

import java.util.HashMap;
import java.util.Map;

public class Testmap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "One");
		map.put(2, "Mahadev");
		map.put(3, "Rays");
		map.put(4, "JAVA");
		
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(4));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.size());
	}

}
