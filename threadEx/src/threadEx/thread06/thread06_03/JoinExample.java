package threadEx.thread06.thread06_03;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join(); //JoinExample 일시정지 상태
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

		System.out.println("1~100 합: " + sumThread.getSum());
	}

}
