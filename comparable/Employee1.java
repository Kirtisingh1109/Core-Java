package in.com.comparable;

public class Employee1 implements Comparable<Employee1>{
	private int Id=0;
	private String name =null;
	private String phone=null;
	
	public Employee1(int Id , String name , String phone) {
		this.Id=Id;
		this.name=name;
		this.phone=phone;
	}
	public void setId(int Id) {
		this.Id=Id;
	}
	public int getId() {
		return Id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	@Override
	public String toString() {
		
		return  Id + " " + name + " " + phone;
		
		
		
		
	}
	@Override
	public int compareTo(Employee1 o) {
		
		return this.Id - o.Id;
	}

}
