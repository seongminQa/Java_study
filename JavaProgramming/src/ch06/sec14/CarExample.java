package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {

		// 객체 생성
		Car myCar = new Car();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-100);
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println(myCar.getSpeed());
		
		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(myCar.getSpeed());
	}

}
