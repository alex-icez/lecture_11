package lecture_11;

class MyThread extends Thread {	
	
	int result;
	
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			System.out.println(this.getName() + " " + i);
			try {
				Thread.sleep(System.currentTimeMillis() % 20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		result = 10;
	}
}

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread th1 = new MyThread("first");
		MyThread th2 = new MyThread("second");
		th1.start();
		th2.start();
		//while(th1.isAlive());
		//while(th2.isAlive());
		th1.join();
		//th2.join();

	
	}

}
