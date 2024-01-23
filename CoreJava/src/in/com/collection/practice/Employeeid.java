package in.com.collection.practice;

public class Employeeid {
	
	private int Id = 0;
	private String name = null;
	private String city = null;
	
	public Employeeid(int Id , String name , String city) {
		this.Id=Id;
		this.name=name;
		this.city=city;
	}
	
	public void setId(int Id) {
		this.Id=Id;
	}
	public int getId() {
		return Id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		
		return Id + " " + name + " " + city;
	}
	
	
}
