package lecture_11;

import java.util.concurrent.atomic.AtomicBoolean;

class MyThread extends Thread {	
	
	int result;
	
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			//System.out.println(this.getName() + " " + i);
			try {
				Thread.sleep(System.currentTimeMillis() % 2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		result = 10;
	}
}

class MyRun implements Runnable {
	
	private Thread thread;
	private AtomicBoolean stopped = new AtomicBoolean();
	
	public MyRun() {
		thread = new Thread(this);
		thread.start();
	}
	
	synchronized public void stopped() {
		if (!stopped.get())
			stopped.set(true);
	}
	
	public void run() {
		stopped.set(false);
		for(int i = 0; i < 100 && !stopped.get(); i++) {
			//System.out.println(thread.getName() + " " + i);
			try {
				Thread.sleep(System.currentTimeMillis() % 20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		MyRun r = new MyRun();
		
		
		MyThread th1 = new MyThread("first");
		MyThread th2 = new MyThread("second");
		th1.start();
		th2.start();
		//while(th1.isAlive());
		//while(th2.isAlive());
		for(Thread t : Thread.getAllStackTraces().keySet())
			System.out.println(t.getName());
		
		th1.join();
		//th2.join();

		System.out.println("\u001B[34m BLABLA ");
		System.out.println((char) 27 + "[31mWarning! " 
		+ (char)27 + "[0m");
	}

}
