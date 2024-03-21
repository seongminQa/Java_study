package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{
	
	// Enum 타입 선언
	public enum FlyMode{
		NORMAL,
		SUPERSONIC
		// 하지만 일반적으로 enum타입은 클래스를 따로두는 편이다
		// 복잡도가 올라갈 수 있다.
	}
	// 상수 선언
//	public static final int NORMAL = 1;
//	public static final int SUPERSONIC = 2;
	
	// 열거 타입 활용
	public FlyMode flyMode = FlyMode.NORMAL;
	
	// 상태 필드
//	public int flyMode = NORMAL;
	
	// 메소드 재정의
	@Override
	public void fly() {
		if(flyMode == FlyMode.SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly();
		}
	}
}
