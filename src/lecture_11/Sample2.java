package lecture_11;

class MyThread extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class Sample2 {

	public static void main(String[] args) {
		

	}

}
