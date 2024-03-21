package ch14.sec07.exam02;

public class InterruptExample {

	public static void main(String[] args) {
		
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		printThread.interrupt();  // InterruptedException 예외 발생 시킴
								  // 반복문을 빠져나올 수 있게 한다.
	}
}
