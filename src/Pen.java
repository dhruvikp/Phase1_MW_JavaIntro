
public class Pen {

	// 1. Instance Variable
	String refill = "Hello";

	
	
	public void write() {
		// 2. Local Variable
		int a = 5;
		
		System.out.println(refill);
	}
	
	
	
	public static void main(String[] args) {
		Pen pen = new Pen();
		
		pen.write();
	}
	
}
