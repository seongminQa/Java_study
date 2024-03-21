package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {

		// 리모콘 변수 선언
		RemoteControl rc, rc2;

		// 리모콘과 연결된 객체 대입
		rc = new Television(); // 리모콘 변수와 텔레비전 구현 객체를 연결

		// 리모콘을 통해서 TV의 전원을 켬
		rc.turnOn();
		// 리모콘을 통해서 TV의 전원을 끔
		rc.turnOff();

		// 리모콘과 연결된 객체 대입
		rc2 = new Audio(); // 리모콘 변수와 텔레비전 구현 객체를 연결

		// 리모콘을 통해서 TV의 전원을 켬
		rc2.turnOn();
		// 리모콘을 통해서 TV의 전원을 끔
		rc2.turnOff();
		
		// 다형성 복습
		// 부품이 무엇이 들어오느냐에 따라 실행결과가 달라진다.
		use(new Television());
		use(new Audio());

	}

	
	// 실제로 이런 형태로 많이 사용한다.
	public static void use(RemoteControl rc) {
		// 여기서 rc는 리모트컨트롤 인터페이스로 사용가능한 객체가 올 수 있다.
		// Television과 Audio 클래스
		rc.turnOn();
	}
}
