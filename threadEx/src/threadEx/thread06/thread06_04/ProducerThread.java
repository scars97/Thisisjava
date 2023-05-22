package threadEx.thread06.thread06_04;

public class ProducerThread extends Thread{
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	public void run() {
		for (int i = 0; i <= 3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data); //새로운 데이터 저장
		}
	}
}
