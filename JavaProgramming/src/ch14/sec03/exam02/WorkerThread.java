package ch14.sec03.exam02;

public class WorkerThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			// 스레드가 작업할 내용
			System.out.println("두 번째 방법");
			
			// 1초간 일시 정지
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
