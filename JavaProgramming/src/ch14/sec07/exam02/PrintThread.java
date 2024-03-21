package ch14.sec07.exam02;

public class PrintThread extends Thread {
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("실행 중");
				Thread.sleep(1);  // 인터럽트 예외가 발생하도록 일시 정지를 만듦.
			}
		} catch (Exception e) {
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
