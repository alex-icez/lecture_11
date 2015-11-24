package lecture_11;

class MyThread extends Thread {	
	
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(this.getName() + " " + i);
			try {
				Thread.sleep(System.currentTimeMillis() % 200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Sample2 {

	public static void main(String[] args) {
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		th1.start();
		th2.start();
	}

}
