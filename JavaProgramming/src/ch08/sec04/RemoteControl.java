package ch08.sec04;

public interface RemoteControl {
	
	int MAX_VOLUME = 10; // 상수 (public static final)이 생략되어 있음
	int MIN_VOLUME = 0;  // 상수
	
	// 추상 메소드 선언
	void turnOn(); 	// (public static)이 생략되어 있음
	void turnOff();  // (public static)이 생략되어 있음
	void setVolume(int volume);  // (public static)이 생략되어 있음

}
