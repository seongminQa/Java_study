package ch14.sec03.exam01;

public class BeepprintExample2 {

	public static void main(String[] args) {
		
		// 작업 1 ------------------------------------
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					Thread curThread = Thread.currentThread();
					curThread.setName("작업 1");
					// 스레드가 작업할 내용
					System.out.println("익명 객체 방법 " + curThread.getName());
					
					// 1초간 일시 정지
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();  // 스레드 사용
		// ----------------------------------------
		
		
		// 작업 2 -------------------------------------
		for(int i=0; i<5; i++) {
			
			Thread curThread = Thread.currentThread();
			curThread.setName("메인");
			// 스레드가 작업할 내용
			System.out.println("가사를 출력합니다." + curThread.getName());
			
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
