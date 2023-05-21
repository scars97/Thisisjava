package threadEx.thread04;

public class StatePrintThread extends Thread{

	private Thread targetThread;
	
	public StatePrintThread(Thread tarThread) {
		this.targetThread = tarThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();//스레드 상태 얻기
			System.out.println("타겟 스레드 상태: " + state);
			
			if(state == Thread.State.NEW) {//객체 생성 상태 경우 실행 대기 상태로 만듦.
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) {//종료 상태 경우 while문 종료.
				break;
			}
			try {
				Thread.sleep(500);//1초간 정지
			}catch(Exception e) {
			}
		}
	}
	
}
