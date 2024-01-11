package in.com.rays;

public class Switch {
public static void main(String[] args) {
	int a = 100;
	int b = 12;
	int c = a%b;
	String value ="%";
	 switch (value) {
	case "+":
		System.out.println("This is a add condition body="+c);
		break;
	case "-":
		System.out.println("This is a subtrac conditin body="+c);
		break;
	case"*":
		System.out.println("This is a Multi condition body="+c);
		break;
	case"%":
		System.out.println("This is a Mode condition body="+c);
		break;

	default:
		System.out.println("This is a default value");
		break;
	}
	
}
}
