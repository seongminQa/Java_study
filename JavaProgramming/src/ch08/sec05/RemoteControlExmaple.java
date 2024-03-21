package ch08.sec05;

public class RemoteControlExmaple {

	public static void main(String[] args) {
		
		// 인터페이스로 정적 메소드 호출
		RemoteControl.changeBattery();
		// 사실상 인터페이스를 사용하는 이유가 없음.
		// 그냥 클래스로 호출하기만 하면됨
	}

}
