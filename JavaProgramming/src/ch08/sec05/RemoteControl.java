package ch08.sec05;

public interface RemoteControl {
	
	int MAX_VOLUME = 10; // 상수 (public static final)이 생략되어 있음
	int MIN_VOLUME = 0;  // 상수
	
	// 추상 메소드 선언
	void turnOn(); 	// (public static)이 생략되어 있음
	void turnOff();  // (public static)이 생략되어 있음
	void setVolume(int volume);  // (public static)이 생략되어 있음

	// 디폴트 메소드 선언
	// 이 메소드는 구현 객체의 것이다. 따라서 구현 객체에서 재정의할 수 있다.
	default void setMute(boolean mute) {  // public이 생략되어 있음
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메소드 선언 (구현 객체와 거의 상관 없는, 객체가 필요없는 메소드)
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
