package in.com.rays;

public class Notecount {
	public static void main(String[] args) {
		int number=7824;
		int count=0;
		int []notes= {500,200,100,50,20,10};
			for (int i = 0; i < notes.length; i++) {
				count= number/notes[i];
				number=number%notes[i];
				if(count>0) {
					System.out.println(notes[i]+"="+count);
			}
		}
    }
}