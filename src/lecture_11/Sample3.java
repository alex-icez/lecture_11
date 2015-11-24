package lecture_11;





public class Sample3 {

	static void print() {
		System.out.print("[ Hello ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("World !!! ]");
	}
	
	public static void main(String[] args) {
		print();

	}
}
