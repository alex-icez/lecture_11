package lecture_11;





public class Sample3 {
	
	static void print() {
		synchronized (Sample3.class) {
			System.out.print("[ Hello ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("World !!! ]");
		}
	}
	
	static class MyThread extends Thread{
		public void run() {
			print();
		}
	}

	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
	}
}
