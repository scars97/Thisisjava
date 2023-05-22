package threadEx.thread08;

import java.util.Map;
import java.util.Set;

import threadEx.thread07.AutoSaveThread;

public class ThreadInfoExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		//프로세스에서 실행하는 모든 Thread를 가져옴
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		//Thread를 하나씩 가져와서 루핑시킴
		Set<Thread> threads = map.keySet();
		for (Thread thread : threads) {
			System.out.println("Name: " + thread.getName() +
								((thread.isDaemon())? "(데몬)" : "(주)"));
			System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
			System.out.println();
		}

	}

}
