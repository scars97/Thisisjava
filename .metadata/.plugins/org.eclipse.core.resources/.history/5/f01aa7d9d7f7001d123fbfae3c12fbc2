package threadEx.thread04;

public class TargetThread extends Thread{

	public void run() {
		for (long i = 0; i < 1000000000; i++) {
			//Runnable 상태(실행대기)
		}
		
		try {//timed_waiting 상태(일시정지)
			Thread.sleep(1500);//2초간 정지
		}catch(Exception e) {
		}
		
		for (long i = 0; i < 1000000000; i++) {
			//Runnable 상태(실행대기)
		}
	}
}
