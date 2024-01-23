package in.com.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class TestStream2 {
	public static void main(String[] args) {
		List<String> name = List.of("Kirti" , "Shivam sir", "Tilu" , "Rudra" , "Rachna" , "Giri" , "Akku" , "Sapna");
		List<String> names = name.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList());
		System.out.println(names);
		
		List<Integer> num = List.of(2,4,6,5,7,8);
		List<Integer> Cube = num.stream().map(i->  i*i*i).collect(Collectors.toList());
		System.out.println(Cube);
		
		List<Integer>num1 = List.of(2,3,4,7,2,5,7,4,6);
		List<Integer>num2 = num1.stream().distinct().collect(Collectors.toList());
		System.out.println(num2);
	}

}
