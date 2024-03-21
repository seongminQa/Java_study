package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		
		// 인터페이스 타입 변수 vehicle은 구현 클래스 Bus로 자동 타입 변환하여 객체를 생성
		Vehicle vehicle = new Bus();
		
		// 인터페이스를 통한 호출
		vehicle.run();
		
		// 강제 타입 변환
		Bus bus = (Bus) vehicle;
		
		bus.checkFare();
	}

}
