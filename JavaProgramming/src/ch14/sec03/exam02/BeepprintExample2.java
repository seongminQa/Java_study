package ch14.sec03.exam02;

public class BeepprintExample2 {

	public static void main(String[] args) {
		// 작업 1 ------------------------------------
		Thread thread = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					// 스레드가 작업할 내용
					System.out.println("두 번째 방법");
					
					// 1초간 일시 정지
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
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
