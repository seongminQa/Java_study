package ch14.sec03.exam01;

public class BeepprintExample {

	public static void main(String[] args) {
		// 작업 1 ------------------------------------
		Runnable runnable = new MusicTask();  // 작업 객체 생성
		Thread thread = new Thread(runnable);  // 하나의 스레드 생성
		thread.start();  // 스레드 사용
		// ----------------------------------------
		
		// 작업 2 -------------------------------------
		for(int i=0; i<5; i++) {
			// 스레드가 작업할 내용
			System.out.println("가사를 출력합니다.");
			
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
