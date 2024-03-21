package ch06.sec09;

public class CarExample {

	public static void main(String[] args) {

		System.out.println(Car.company);
		
		// 정적 메소드 info 사용
		Car.info();
		
		// 객체 생성
		Car myCar = new Car("G80");
		
		// 인스턴스 메소드 setSpeed 사용
		myCar.setSpeed(60);
		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		
		// 인스턴스 메소드 run 사용
		myCar.run();
		
		// 올바르지 않은 표현.. 실행은 되지만, 이렇게 사용하면 안된다!
		System.out.println(myCar.company);
		myCar.info();
		
		
	}

}
