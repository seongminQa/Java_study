package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		
		// 공유 객체 생성
		Calculator calc = new Calculator();
		
		// 공유 객체를 User1Thread에 주입
		User1Thread user1 = new User1Thread();
		user1.setCalculator(calc);
		
		// 공유 객체를 User2Thread에 주입
		User2Thread user2 = new User2Thread();
		user2.setCalculator(calc);
		
		// User1Thread가 계산기를 먼저 사용,  User2Thread가 계산기를 나중에 사용
		user1.start();
		user2.start();
	}

}
