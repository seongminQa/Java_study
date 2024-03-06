package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		// Car 객체를 생성
		Car myCar = new Car();
		
		myCar.model = "그랜저";
		myCar.start = true;
		myCar.speed = 60;
		
		// Car 객체 내부의 데이터 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("속도: " + myCar.speed);
		System.out.println();
		
		// Car 객체를 생성
		Car yourCar = new Car();
		
		// Car 객체 내부의 데이터 읽기
		System.out.println("모델명: " + yourCar.model);
		System.out.println("시동여부: " + yourCar.start);
		System.out.println("속도: " + yourCar.speed);
	}

}
