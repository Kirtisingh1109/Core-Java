package in.com.practice;

public class Constcallex {
	String Name=null;
	String Class=null;
	String Section=null;
	String School=null;
	String Age=null;
	
	public Constcallex () {
		System.out.println("Default");
	}
	public Constcallex (String na , String cl) {
		Name=na;
		Class=cl;
		System.out.println("Two param");
		
	}
	public Constcallex (String na , String cl , String se) {
		Name=na;
		Class=cl;
		Section=se;
		System.out.println("Three param");
	}
	public Constcallex (String na , String cl, String se, String sc) {
		Name=na;
		Class=cl;
		Section=se;
		School=sc;
		System.out.println("Four Param");
	}
	public Constcallex(String na , String cl , String se , String sc , String ag ) {
		Name=na;
		Class=cl;
		Section=se;
		School=sc;
		Age=ag;
		System.out.println("Five Param");
	}
	

}
