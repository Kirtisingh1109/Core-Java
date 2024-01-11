package in.com.rays;

public class Stringbuffer1 {
	public static void main(String[] args) {
		String name = "rays";
		System.out.println(name);
		
		
		StringBuffer sb = new StringBuffer("RAys");
		sb.append("TEchnologies");
		System.out.println(sb);
		System.out.println("Length :"+sb.length());
		System.out.println("capacity :"+sb.capacity());
		System.out.println("Char at:"+sb.charAt(5));
		System.out.println("Index of:"+sb.indexOf("RAys"));
		System.out.println("Replace :"+sb.replace(0, 4, "kirti"));
		System.out.println("Reverse :"+sb.reverse());
	}

}
