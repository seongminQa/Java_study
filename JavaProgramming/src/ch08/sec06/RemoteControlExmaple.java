package ch08.sec06;

public class RemoteControlExmaple {

	public static void main(String[] args) {
		
		// 인터페이스 변수 선언
		RemoteControl rc1, rc2, rc3, rc4;
		
		// 인터페이스로 사용할 객체 연결
		rc1 = new Television();
		
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.turnOff();
		
		//
		rc2 = new Audio();
		rc2.turnOn();
		rc2.setVolume(8);
		rc2.turnOff();
		
		// use 메소드 사용
		use(new Television());
		use(new Audio());
		
		//
		rc3 = new Television();
		rc3.turnOn();
		rc3.setVolume(8);
		rc3.setMute(true);	// 소스는 인터페이스에 정의되어있지만, 구현 객체가 할당되어야 실행이 된다!	
		rc3.turnOff();
		
		// Audio에서 setMute 재정의해보기
		rc4 = new Audio();
		rc4.turnOn();
		rc4.setVolume(8);
		rc4.setMute(true);	// 소스는 인터페이스에 정의되어있지만, 구현 객체가 할당되어야 실행이 된다!
		rc4.setMute(false);
		rc4.turnOff();
		
		
	}
	
	// 실제 많이 사용
	public static void use(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
	}

}
