package ch08.sec04;

public class RemoteControlExmaple {

	public static void main(String[] args) {
		
		// 인터페이스 변수 선언
		RemoteControl rc1, rc2;
		
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
	}
	
	// 실제 많이 사용
	public static void use(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
	}

}
