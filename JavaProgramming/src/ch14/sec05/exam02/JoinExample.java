package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();	// main 스레드가 sumThread의 작업이 끝나기까지 기다려줌
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1~100 합: " + sumThread.getSum());
		
	}

}
