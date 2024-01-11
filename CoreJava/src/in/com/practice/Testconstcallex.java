package in.com.practice;

public class Testconstcallex {
	public static void main(String[] args) {
		Constcallex  c = new Constcallex();
		Constcallex c1 = new Constcallex("Aryan" , "6th");
		Constcallex c2 = new Constcallex(" Aryan", "6th" , "A");
		Constcallex c3 = new Constcallex("Aryan", "6th","A","Little Angle");
		Constcallex c4 = new Constcallex("Aryan","6th","A","Little Angle", "11");
 		//Name=Aryan , Class=6 , Section=a, School= Little angle , Age=11//
		System.out.println("c:"+c.Name+","+c.Class+","+c.Section+","+c.School+","+c.Age);
		System.out.println("c1:"+c1.Name+","+c1.Class+","+c1.Section+","+c1.School+","+c.Age);
		System.out.println("c2:"+c2.Name+","+c2.Class+","+c2.Section+","+c2.School+","+c2.Age);
		System.out.println("c3:"+c3.Name+","+c3.Class+","+c3.Section+","+c3.School+","+c3.Age);
		System.out.println("c4:"+c4.Name+","+c4.Class+","+c4.Section+","+c4.School+","+c4.Age);
	}

}
