package ch14.sec06.exam03;

// 공유 객체
public class WorkObject {

	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": method A 작업 실행 ");
		notify();  // 상대방을 깨운다 (실행대기 상태로 만듦)
		try {
			wait();	// 자신의 스레드를 일시 정지 상태로 만듦
		} catch (InterruptedException e) {
		}	 // 자기 자신은 일시정지
	}

	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": method B 작업 실행 ");
		notify();  // 상대방을 깨운다 (실행대기 상태로 만듦)
		try {
			wait(); // 자신의 스레드를 일시 정지 상태로 만듦
		} catch (InterruptedException e) {
		}	 // 자기 자신은 일시정지
	}

}
