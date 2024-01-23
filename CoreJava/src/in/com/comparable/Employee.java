package in.com.comparable;

public class Employee implements Comparable<Employee>{
	private int empID=0;
	private String name=null;
	private String phone = null;
	
	public Employee(int empID , String name , String phone) {
	this.empID=empID;
	this.name=name;
	this.phone=phone;
	
	}
	public void setEmpID(int empID) {
		this.empID=empID;
	}
	public int getEmpID() {
		return empID;
	}
	public void setName(String name) {
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
		
		return empID + " " + name + " " + phone;
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.empID - o.empID;
	}
}
