package in.com.Abs;

public class Student implements Cloneable {
	int Marks;
	
	public Student(int Marks) {
		this.Marks=Marks;
	
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
