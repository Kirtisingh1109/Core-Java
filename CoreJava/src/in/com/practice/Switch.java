package in.com.practice;

public class Switch {
public static void main(String[] args) {
	int a=120;
	int b=25;
	int c=a%b;
	String value ="%";
	switch ("%") {
	case "+":
		System.out.println("this is a add cnditin body="+c);
		break;
	case "-":
		System.out.println("This is a sub condition body="+c);
		break;
	case "%":
		System.out.println("This is a module condition body="+c);
		break;
	case"/":
		System.out.println("this is a divide condition body="+c);

	default:
		break;
	}
}
}
