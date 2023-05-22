package threadEx.thread06.thread06_05;

public class InterruptExample {
	
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		thread.interrupt();
	}
}
