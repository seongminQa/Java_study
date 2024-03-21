package ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {

		// 자동차 객체 생성
		Car myCar = new Car();
		
		// 자동차 달리게 한다.
		myCar.run();
		
		// 타이어 교체해보기
		myCar.tire1 = new KumhoTire();
		
		myCar.run();
		
		
		
	}

}
