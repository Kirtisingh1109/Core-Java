package in.com.practice;

public class TestIphone {
	public static void main(String[] args) {
		Iphone i= new Iphone();
		i.setcolor("mintgreen");
		i.setprice(58000);
		i.setram("16gb");
		i.setrom("256gb");
		i.setcamera("50mp");
		
		System.out.println(i.getColor());
		System.out.println(i.getPrice());
		System.out.println(i.getRam());
		System.out.println(i.getRom());
		System.out.println(i.getCamera());
	}

}
