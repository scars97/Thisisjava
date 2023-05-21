package threadEx.thread01;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		
		Thread thread = new BeepThread();
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(2000);//2초 간격
			}catch(Exception e) {
			}
		}

	}

}
