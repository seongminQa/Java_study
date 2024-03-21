package ch14.sec06.exam03;

public class WaitNotifyExample {

	public static void main(String[] args) {
		
		// 공유 객체 생성
		WorkObject wo = new WorkObject();
		
		// 두 개의 스레드를 생성할 때 공유 객체를 주입
		ThreadA threadA = new ThreadA(wo);
		ThreadB threadB = new ThreadB(wo);
		
		// 두 개의 스레드를 실행
		threadA.start();
		threadB.start();
		
		
	}

}
