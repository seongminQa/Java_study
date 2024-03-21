package ch14.sec03.exam01;

public class MusicTask implements Runnable {
	@Override
	public void run() {
		// 작업 1 ------------------------------------
		for(int i=0; i<5; i++) {
			// 스레드가 작업할 내용
			System.out.println("비프음을 발생");
			
			// 1초간 일시 정지
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		// ----------------------------------------
	}

}
