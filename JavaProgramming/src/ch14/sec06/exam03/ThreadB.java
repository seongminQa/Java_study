package ch14.sec06.exam03;

public class ThreadB extends Thread {
	// 공유 객체 필드 선언
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10000; i++) {
			workObject.methodB();
		}
	}
	
}
