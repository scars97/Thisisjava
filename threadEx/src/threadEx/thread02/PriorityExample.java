package threadEx.thread02;

public class PriorityExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if (i != 9) {
				thread.setPriority(Thread.MIN_PRIORITY);//가장 낮은 순위
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);//가장 높은 순위
			}
			thread.start();
		}

	}

}
