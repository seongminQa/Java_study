package ch14.sec07.exam03;

public class InterruptExample {

	public static void main(String[] args) {
		
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		printThread.interrupt();
	}

}
