package threadEx.thread06.thread06_02;

public class ThreadA extends Thread{

	public boolean stop = false; //종료 플래그
	public boolean work = true; //작업 진행 여부 플래그
	
	public void run() {
		while(!stop) { //stop이 true가 되면 while문 종료
			if(work) {
				System.out.println("ThreadA 작업 내용");
			}else { 
				Thread.yield(); //work가 false가 되면 다른 스레드에게 실행 양보
			}
		}
		System.out.println("ThreadA 종료");
	}
}
