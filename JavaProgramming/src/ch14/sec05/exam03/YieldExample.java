package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		workThreadA.work = false;
		
		try {	// 스레드 B에게 실행의 기회를 더 많이 준다.
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		workThreadA.work = true;
	}

}
