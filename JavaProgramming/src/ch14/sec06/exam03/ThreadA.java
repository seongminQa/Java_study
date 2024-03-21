package ch14.sec06.exam03;

public class ThreadA extends Thread {
	// 공유 객체 필드 선언
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		setName("ThreadA");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10000; i++) {
			workObject.methodA();
		}
	}
	
}
