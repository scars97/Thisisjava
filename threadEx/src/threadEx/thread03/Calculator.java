package threadEx.thread03;

public class Calculator { //공유객체

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//동기화 메서드
//	public synchronized void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		}catch(InterruptedException e) {
//		}
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}
	
	//동기화 블록
	public void setMemory(int memory) {
		synchronized (this) { //공유객체가 자신이면 this 사용 가능
			this.memory = memory;
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory + " 저장");
		}
	}
}
