package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {

		// 객체 생성
		SmartPhone p1 = new SmartPhone("갤럭시", "퍼플");
		
		// 상속받은 필드 읽어보기
		System.out.println("모델: " + p1.model);
		System.out.println("색상: " + p1.color);
		
		// SmartPheon 필드 읽기
		System.out.println("와이파이 상태: " + p1.wifi);
		
		// Phone으로부터 상속받은 메소드 호출
		p1.bell();
		p1.sendVoice("안녕하십니까~");
		p1.receiveVoice("아니, 이게 누구신가!!");
		p1.sendVoice("오바하지마세요.");
		p1.hangup();
		
		// SmartPhone의 메소드 호출
		p1.setWifi(true);
		p1.internet();
		
	}

}
