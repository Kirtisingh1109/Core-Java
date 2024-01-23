package in.com.collection;

public class Employee1 {
	private int id=0;
	private String name=null;
	private String address = null;
	
	public Employee1(int id , String name , String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void setID(int id) {
		this.id=id;
	}
	public int getID() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		
		return id + " " + name + " " + address;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee1)) {
			return false;
		}
		Employee1 e = (Employee1) obj;
		boolean b = this.id == e.id && this.name == e.name && this.address ==e.address;
		return b;
 		
	}
	@Override
	public int hashCode() {
		String str = id + name + address;
		return str.hashCode();
	}

}

