package ex06;

public class PrintThread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("running");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("terminating");
	}
}


