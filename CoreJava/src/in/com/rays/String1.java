package in.com.rays;

public class String1 {
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chauhan";
		
		System.out.println(" String Length -"+ name.length());
		System.out.println("7th character is -"+name.charAt(0));
		System.out.println("Dina index is -"+name.indexOf("Dina"));
		System.out.println("First i position -"+name.indexOf("i"));
		System.out.println("Last i position -"+name.lastIndexOf("i"));
		System.out.println("a is replacement by K -"+name.replace("a", "k"));
		System.out.println(" Small Vijay -"+name.toLowerCase());
		System.out.println(" Capital Vijay -"+name.toUpperCase());
		System.out.println("Start with VIjay -"+name.startsWith("Kirti"));
		System.out.println("Ends with han -"+name.endsWith("Kirti"));
		System.out.println("Sbstring -"+name.substring(7));
	}

}
