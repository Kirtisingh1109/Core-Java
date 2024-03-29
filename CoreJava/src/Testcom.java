import java.util.Comparator;

public class Testcom implements Comparator<Testcom>{
	private int id=0;
	private String name = null;
	private String city = null;
	
	public Testcom(int id , String name , String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
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
		
		return id + " " + name + " " + city;
	}

}
