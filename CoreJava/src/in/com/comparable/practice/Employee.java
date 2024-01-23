package in.com.comparable.practice;

public class Employee implements Comparable<Employee>{
	public int empID=0;
	public String name = null;
	public String Address = null;
	
	public Employee(int empID , String name , String Address) {
		this.empID=empID;
		this.name=name;
		this.Address=Address;
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
	public void setAddress(String Address) {
		this.Address=Address;
	}
	public String getAddress() {
		return Address;
	}
	@Override
	public String toString() {
		
		return empID + " " + name + " " + Address;
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.empID - o.empID;
	}
	
	}
	


