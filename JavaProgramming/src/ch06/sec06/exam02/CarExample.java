package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		
		// Car 객체를 생성 및 생성자 호출
		Car myCar = new Car();
		// 1. new 객체 생성 연산자로 인해 Car 객체가 생성됨. --> Car 클래스의 필드가 선언과 초기화가 진행됨.
		// 2. Car() 생성자가 호출됨. --> Car 클래스의 필드를 수정 가능함
		// 3. 생성된 Car 객체의 주소를 참조하는 변수 myCar에 주소값을 대입.
		// 4. 이 후 myCar 변수는 Car 객체의 메소드를 호출할 수 있음.
		
		// 필드값 읽기
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		// 메소드 호출
		myCar.run();
		
		// 메소드 호출 후 필드값 변경 확인
		System.out.println(myCar.speed);
		
		
	}

}
