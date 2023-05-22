package threadEx.thread06.thread06_04;

public class ConsumerThread extends Thread{
	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	public void run() {
		for (int i = 0; i <= 3; i++) {
			dataBox.getData(); // 새로운 데이터 가져오기
		}
	}
}
