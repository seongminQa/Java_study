package ch14.sec05.exam03;

public class WorkThread extends Thread {
	// Field
	public boolean work = true;
	
	// Constructor
	public WorkThread(String name) {
		setName(name);  // Thread의 세터
	}
	
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + ": 작업처리");
			} else {
				Thread.yield();
			}
		}
	}
	
}
