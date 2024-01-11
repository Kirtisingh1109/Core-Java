package in.com.Abs;

public class Teststudent {
	public static void main(String[] args) throws Exception {
		Student s = new Student(145);
		Student s2=(Student) s.clone();
		s2.Marks = 101;
		
		System.out.println(s.Marks);
		System.out.println(s2.Marks);
	}

}
